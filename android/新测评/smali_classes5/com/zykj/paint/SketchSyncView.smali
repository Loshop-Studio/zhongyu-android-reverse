# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class public Lcom/zykj/paint/SketchSyncView;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field public static final ACTION_ERASER:I = 0x3

.field public static final ACTION_MOVE_MAP:I = 0x4

.field public static final ACTION_PEN:I = 0x2

.field public static final ACTION_SELECT:I = 0x1

.field private static final SPACE_TIME:I = 0x1f4

.field private static final TAG:Ljava/lang/String; = "SketchSyncView"


# instance fields
.field public actionMode:I

.field private boardPaint:Landroid/graphics/Paint;

.field private context:Landroid/app/Activity;

.field public ezyActionList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

.field public graphId:I

.field private height:I

.field private iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

.field private isCurrentSketchSticky:Z

.field private isInitSuccess:Z

.field private isMultiMode:Z

.field private isRecord:Z

.field private isTouchable:Z

.field private lastRenderIndex:I

.field private lastSelectIndex:I

.field private mBaseBitmap:Landroid/graphics/Bitmap;

.field private mBaseCanvas:Landroid/graphics/Canvas;

.field private mCoverBitmap:Landroid/graphics/Bitmap;

.field private mCoverCanvas:Landroid/graphics/Canvas;

.field public mCurrentStartAt:J

.field private mDefaultSize:I

.field private mPaint:Landroid/graphics/Paint;

.field public mStartTime:J

.field private mStrokeColor:I

.field private mapSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

.field private mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

.field private sketchControls:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/paint/record/control/ISketchControl;",
            ">;"
        }
    .end annotation
.end field

.field private tempPenControl:Lcom/zykj/paint/record/control/PenControl;

.field public tempPolyline:Lcom/zykj/paint/Actions$NewPolylineData$Builder;

.field public timeRecord:J

.field private touchDownTime:J

.field private width:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x2

    .line 2
    iput p1, p0, Lcom/zykj/paint/SketchSyncView;->actionMode:I

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 4
    iput-object p1, p0, Lcom/zykj/paint/SketchSyncView;->mapSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    const p1, -0xff0001

    .line 5
    iput p1, p0, Lcom/zykj/paint/SketchSyncView;->mStrokeColor:I

    const/4 p1, 0x3

    .line 6
    iput p1, p0, Lcom/zykj/paint/SketchSyncView;->mDefaultSize:I

    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/zykj/paint/SketchSyncView;->isCurrentSketchSticky:Z

    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lcom/zykj/paint/SketchSyncView;->lastSelectIndex:I

    .line 9
    iput v0, p0, Lcom/zykj/paint/SketchSyncView;->lastRenderIndex:I

    .line 10
    invoke-static {}, Lcom/zykj/paint/Actions$EzyActionList;->newBuilder()Lcom/zykj/paint/Actions$EzyActionList$Builder;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/paint/SketchSyncView;->ezyActionList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    const/4 v0, 0x1

    .line 11
    iput v0, p0, Lcom/zykj/paint/SketchSyncView;->graphId:I

    .line 12
    iput-boolean v0, p0, Lcom/zykj/paint/SketchSyncView;->isTouchable:Z

    .line 13
    iput-boolean p1, p0, Lcom/zykj/paint/SketchSyncView;->isRecord:Z

    .line 14
    invoke-direct {p0}, Lcom/zykj/paint/SketchSyncView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 15
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x2

    .line 16
    iput p1, p0, Lcom/zykj/paint/SketchSyncView;->actionMode:I

    const/4 p1, 0x0

    .line 17
    iput-object p1, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 18
    iput-object p1, p0, Lcom/zykj/paint/SketchSyncView;->mapSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    const p1, -0xff0001

    .line 19
    iput p1, p0, Lcom/zykj/paint/SketchSyncView;->mStrokeColor:I

    const/4 p1, 0x3

    .line 20
    iput p1, p0, Lcom/zykj/paint/SketchSyncView;->mDefaultSize:I

    const/4 p1, 0x0

    .line 21
    iput-boolean p1, p0, Lcom/zykj/paint/SketchSyncView;->isCurrentSketchSticky:Z

    const/4 p2, -0x1

    .line 22
    iput p2, p0, Lcom/zykj/paint/SketchSyncView;->lastSelectIndex:I

    .line 23
    iput p2, p0, Lcom/zykj/paint/SketchSyncView;->lastRenderIndex:I

    .line 24
    invoke-static {}, Lcom/zykj/paint/Actions$EzyActionList;->newBuilder()Lcom/zykj/paint/Actions$EzyActionList$Builder;

    move-result-object p2

    iput-object p2, p0, Lcom/zykj/paint/SketchSyncView;->ezyActionList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    const/4 p2, 0x1

    .line 25
    iput p2, p0, Lcom/zykj/paint/SketchSyncView;->graphId:I

    .line 26
    iput-boolean p2, p0, Lcom/zykj/paint/SketchSyncView;->isTouchable:Z

    .line 27
    iput-boolean p1, p0, Lcom/zykj/paint/SketchSyncView;->isRecord:Z

    .line 28
    invoke-direct {p0}, Lcom/zykj/paint/SketchSyncView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 29
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x2

    .line 30
    iput p1, p0, Lcom/zykj/paint/SketchSyncView;->actionMode:I

    const/4 p1, 0x0

    .line 31
    iput-object p1, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 32
    iput-object p1, p0, Lcom/zykj/paint/SketchSyncView;->mapSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    const p1, -0xff0001

    .line 33
    iput p1, p0, Lcom/zykj/paint/SketchSyncView;->mStrokeColor:I

    const/4 p1, 0x3

    .line 34
    iput p1, p0, Lcom/zykj/paint/SketchSyncView;->mDefaultSize:I

    const/4 p1, 0x0

    .line 35
    iput-boolean p1, p0, Lcom/zykj/paint/SketchSyncView;->isCurrentSketchSticky:Z

    const/4 p2, -0x1

    .line 36
    iput p2, p0, Lcom/zykj/paint/SketchSyncView;->lastSelectIndex:I

    .line 37
    iput p2, p0, Lcom/zykj/paint/SketchSyncView;->lastRenderIndex:I

    .line 38
    invoke-static {}, Lcom/zykj/paint/Actions$EzyActionList;->newBuilder()Lcom/zykj/paint/Actions$EzyActionList$Builder;

    move-result-object p2

    iput-object p2, p0, Lcom/zykj/paint/SketchSyncView;->ezyActionList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    const/4 p2, 0x1

    .line 39
    iput p2, p0, Lcom/zykj/paint/SketchSyncView;->graphId:I

    .line 40
    iput-boolean p2, p0, Lcom/zykj/paint/SketchSyncView;->isTouchable:Z

    .line 41
    iput-boolean p1, p0, Lcom/zykj/paint/SketchSyncView;->isRecord:Z

    .line 42
    invoke-direct {p0}, Lcom/zykj/paint/SketchSyncView;->init()V

    return-void
.end method

.method public static synthetic access$000(Lcom/zykj/paint/SketchSyncView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/paint/SketchSyncView;->width:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$002(Lcom/zykj/paint/SketchSyncView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/paint/SketchSyncView;->width:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$100(Lcom/zykj/paint/SketchSyncView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/paint/SketchSyncView;->height:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$102(Lcom/zykj/paint/SketchSyncView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/paint/SketchSyncView;->height:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$200(Lcom/zykj/paint/SketchSyncView;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/SketchSyncView;->mCoverBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$202(Lcom/zykj/paint/SketchSyncView;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/SketchSyncView;->mCoverBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$300(Lcom/zykj/paint/SketchSyncView;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/SketchSyncView;->mBaseBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$302(Lcom/zykj/paint/SketchSyncView;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/SketchSyncView;->mBaseBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$402(Lcom/zykj/paint/SketchSyncView;Landroid/graphics/Canvas;)Landroid/graphics/Canvas;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/SketchSyncView;->mCoverCanvas:Landroid/graphics/Canvas;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$502(Lcom/zykj/paint/SketchSyncView;Landroid/graphics/Canvas;)Landroid/graphics/Canvas;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/SketchSyncView;->mBaseCanvas:Landroid/graphics/Canvas;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$602(Lcom/zykj/paint/SketchSyncView;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/paint/SketchSyncView;->isInitSuccess:Z

    .line 2
    .line 3
    return p1
.end method

.method private ezyColor(I)Lcom/zykj/paint/Actions$EzyColor$Builder;
    .locals 4

    .line 1
    shr-int/lit8 v0, p1, 0x18

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    shr-int/lit8 v1, p1, 0x10

    .line 6
    .line 7
    and-int/lit16 v1, v1, 0xff

    .line 8
    .line 9
    shr-int/lit8 v2, p1, 0x8

    .line 10
    .line 11
    and-int/lit16 v2, v2, 0xff

    .line 12
    .line 13
    and-int/lit16 p1, p1, 0xff

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/paint/Actions$EzyColor;->newBuilder()Lcom/zykj/paint/Actions$EzyColor$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3, v0}, Lcom/zykj/paint/Actions$EzyColor$Builder;->setAlpha(I)Lcom/zykj/paint/Actions$EzyColor$Builder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, v1}, Lcom/zykj/paint/Actions$EzyColor$Builder;->setRed(I)Lcom/zykj/paint/Actions$EzyColor$Builder;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0, v2}, Lcom/zykj/paint/Actions$EzyColor$Builder;->setGreen(I)Lcom/zykj/paint/Actions$EzyColor$Builder;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, p1}, Lcom/zykj/paint/Actions$EzyColor$Builder;->setBlue(I)Lcom/zykj/paint/Actions$EzyColor$Builder;

    .line 32
    .line 33
    .line 34
    return-object v3
.end method

.method private handleEvent(Landroid/view/MotionEvent;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x3

    .line 6
    const/4 v2, 0x2

    .line 7
    if-eqz v0, :cond_a

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    if-eq v0, v3, :cond_7

    .line 12
    .line 13
    if-eq v0, v2, :cond_4

    .line 14
    .line 15
    const/4 v3, 0x5

    .line 16
    if-eq v0, v3, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x6

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iput-boolean v4, p0, Lcom/zykj/paint/SketchSyncView;->isCurrentSketchSticky:Z

    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Lcom/zykj/paint/record/control/ISketchControl;->touchPointerUp(Landroid/view/MotionEvent;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget v0, p0, Lcom/zykj/paint/SketchSyncView;->actionMode:I

    .line 34
    .line 35
    if-eq v0, v2, :cond_3

    .line 36
    .line 37
    if-ne v0, v1, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/paint/SketchSyncView;->setSelectSketchControl(Landroid/view/MotionEvent;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->mapSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 45
    .line 46
    iput-object v0, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 47
    .line 48
    :goto_1
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 49
    .line 50
    invoke-interface {v0, p1}, Lcom/zykj/paint/record/control/ISketchControl;->touchPointerDown(Landroid/view/MotionEvent;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_4
    iget v0, p0, Lcom/zykj/paint/SketchSyncView;->actionMode:I

    .line 58
    .line 59
    if-ne v0, v2, :cond_5

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lcom/zykj/paint/SketchSyncView;->setSelectSketchControl(Landroid/view/MotionEvent;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->tempPenControl:Lcom/zykj/paint/record/control/PenControl;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Lcom/zykj/paint/record/control/PenControl;->touchMove(Landroid/view/MotionEvent;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lcom/zykj/paint/SketchSyncView;->addPenTempPolylinePoint(Landroid/view/MotionEvent;)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_5
    if-ne v0, v1, :cond_6

    .line 74
    .line 75
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 76
    .line 77
    invoke-interface {v0}, Lcom/zykj/paint/record/control/ISketchControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0, p1}, Lcom/zykj/paint/record/model/GraphSnapShot;->delByLines(Landroid/view/MotionEvent;)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_6
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 86
    .line 87
    invoke-interface {v0, p1}, Lcom/zykj/paint/record/control/ISketchControl;->touchMove(Landroid/view/MotionEvent;)V

    .line 88
    .line 89
    .line 90
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_7
    iget v0, p0, Lcom/zykj/paint/SketchSyncView;->actionMode:I

    .line 95
    .line 96
    if-ne v0, v2, :cond_9

    .line 97
    .line 98
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->tempPenControl:Lcom/zykj/paint/record/control/PenControl;

    .line 99
    .line 100
    invoke-virtual {v0, p1}, Lcom/zykj/paint/record/control/PenControl;->touchUp(Landroid/view/MotionEvent;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p1}, Lcom/zykj/paint/SketchSyncView;->addPenTempPolylinePoint(Landroid/view/MotionEvent;)V

    .line 104
    .line 105
    .line 106
    iget-boolean v0, p0, Lcom/zykj/paint/SketchSyncView;->isCurrentSketchSticky:Z

    .line 107
    .line 108
    if-eqz v0, :cond_8

    .line 109
    .line 110
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 111
    .line 112
    invoke-interface {v0}, Lcom/zykj/paint/record/control/ISketchControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 117
    .line 118
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView;->tempPolyline:Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Lcom/zykj/paint/record/model/PictureSnapShot;->addStickyEzyPath(Lcom/zykj/paint/Actions$NewPolylineData$Builder;)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_8
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 125
    .line 126
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView;->tempPolyline:Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Lcom/zykj/paint/record/model/MapSnapShot;->addStickyEzyPath(Lcom/zykj/paint/Actions$NewPolylineData$Builder;)V

    .line 129
    .line 130
    .line 131
    :cond_9
    :goto_3
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->tempPenControl:Lcom/zykj/paint/record/control/PenControl;

    .line 132
    .line 133
    iget-object v0, v0, Lcom/zykj/paint/record/control/PenControl;->m_path:Landroid/graphics/Path;

    .line 134
    .line 135
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 136
    .line 137
    .line 138
    iput-boolean v4, p0, Lcom/zykj/paint/SketchSyncView;->isCurrentSketchSticky:Z

    .line 139
    .line 140
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 141
    .line 142
    invoke-interface {v0, p1}, Lcom/zykj/paint/record/control/ISketchControl;->touchUp(Landroid/view/MotionEvent;)V

    .line 143
    .line 144
    .line 145
    new-instance p1, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    const-string v0, "[updateSelectMode actionMode]-->"

    .line 151
    .line 152
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    iget v0, p0, Lcom/zykj/paint/SketchSyncView;->actionMode:I

    .line 156
    .line 157
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    const-string v0, "SketchSyncView"

    .line 165
    .line 166
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_a
    invoke-virtual {p0, p1}, Lcom/zykj/paint/SketchSyncView;->setSelectSketchControl(Landroid/view/MotionEvent;)V

    .line 174
    .line 175
    .line 176
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 177
    .line 178
    .line 179
    move-result-wide v3

    .line 180
    iput-wide v3, p0, Lcom/zykj/paint/SketchSyncView;->mCurrentStartAt:J

    .line 181
    .line 182
    iget v0, p0, Lcom/zykj/paint/SketchSyncView;->actionMode:I

    .line 183
    .line 184
    if-ne v0, v2, :cond_b

    .line 185
    .line 186
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->tempPenControl:Lcom/zykj/paint/record/control/PenControl;

    .line 187
    .line 188
    invoke-virtual {v0, p1}, Lcom/zykj/paint/record/control/PenControl;->touchDown(Landroid/view/MotionEvent;)V

    .line 189
    .line 190
    .line 191
    invoke-static {}, Lcom/zykj/paint/Actions$NewPolylineData;->newBuilder()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    iput-object v0, p0, Lcom/zykj/paint/SketchSyncView;->tempPolyline:Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    .line 196
    .line 197
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView;->boardPaint:Landroid/graphics/Paint;

    .line 198
    .line 199
    invoke-virtual {v1}, Landroid/graphics/Paint;->getColor()I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    invoke-direct {p0, v1}, Lcom/zykj/paint/SketchSyncView;->ezyColor(I)Lcom/zykj/paint/Actions$EzyColor$Builder;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-virtual {v0, v1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->setColor(Lcom/zykj/paint/Actions$EzyColor$Builder;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0, p1}, Lcom/zykj/paint/SketchSyncView;->addPenTempPolylinePoint(Landroid/view/MotionEvent;)V

    .line 211
    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_b
    if-ne v0, v1, :cond_c

    .line 215
    .line 216
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 217
    .line 218
    if-eqz v0, :cond_c

    .line 219
    .line 220
    invoke-interface {v0}, Lcom/zykj/paint/record/control/ISketchControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    if-eqz v0, :cond_c

    .line 225
    .line 226
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 227
    .line 228
    invoke-interface {v0}, Lcom/zykj/paint/record/control/ISketchControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v0, p1}, Lcom/zykj/paint/record/model/GraphSnapShot;->delByLines(Landroid/view/MotionEvent;)V

    .line 233
    .line 234
    .line 235
    :cond_c
    :goto_4
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 236
    .line 237
    invoke-interface {v0, p1}, Lcom/zykj/paint/record/control/ISketchControl;->touchDown(Landroid/view/MotionEvent;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 241
    .line 242
    .line 243
    return-void
.end method

.method private handleMultiFingerEvent(Landroid/view/MotionEvent;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v0, v2, :cond_4

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    if-eq v0, v3, :cond_3

    .line 13
    .line 14
    const/4 v3, 0x5

    .line 15
    if-eq v0, v3, :cond_1

    .line 16
    .line 17
    const/4 v2, 0x6

    .line 18
    if-eq v0, v2, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iput-boolean v1, p0, Lcom/zykj/paint/SketchSyncView;->isCurrentSketchSticky:Z

    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 24
    .line 25
    invoke-interface {v0, p1}, Lcom/zykj/paint/record/control/ISketchControl;->touchPointerUp(Landroid/view/MotionEvent;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget v0, p0, Lcom/zykj/paint/SketchSyncView;->actionMode:I

    .line 33
    .line 34
    if-ne v0, v2, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lcom/zykj/paint/SketchSyncView;->setSelectSketchControl(Landroid/view/MotionEvent;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->mapSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 41
    .line 42
    iput-object v0, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 43
    .line 44
    :goto_0
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 45
    .line 46
    invoke-interface {v0, p1}, Lcom/zykj/paint/record/control/ISketchControl;->touchPointerDown(Landroid/view/MotionEvent;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 54
    .line 55
    invoke-interface {v0, p1}, Lcom/zykj/paint/record/control/ISketchControl;->touchMove(Landroid/view/MotionEvent;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_4
    iput-boolean v1, p0, Lcom/zykj/paint/SketchSyncView;->isCurrentSketchSticky:Z

    .line 63
    .line 64
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 65
    .line 66
    invoke-interface {v0, p1}, Lcom/zykj/paint/record/control/ISketchControl;->touchUp(Landroid/view/MotionEvent;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_5
    invoke-virtual {p0, p1}, Lcom/zykj/paint/SketchSyncView;->setSelectSketchControl(Landroid/view/MotionEvent;)V

    .line 74
    .line 75
    .line 76
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    iput-wide v0, p0, Lcom/zykj/paint/SketchSyncView;->mCurrentStartAt:J

    .line 81
    .line 82
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 83
    .line 84
    invoke-interface {v0, p1}, Lcom/zykj/paint/record/control/ISketchControl;->touchDown(Landroid/view/MotionEvent;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method private init()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lcom/zykj/paint/SketchSyncView$1;

    .line 10
    .line 11
    invoke-direct {v2, p0}, Lcom/zykj/paint/SketchSyncView$1;-><init>(Lcom/zykj/paint/SketchSyncView;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Landroid/graphics/Paint;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lcom/zykj/paint/SketchSyncView;->mPaint:Landroid/graphics/Paint;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView;->mPaint:Landroid/graphics/Paint;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Landroid/graphics/Paint;

    .line 33
    .line 34
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lcom/zykj/paint/SketchSyncView;->boardPaint:Landroid/graphics/Paint;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView;->boardPaint:Landroid/graphics/Paint;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setDither(Z)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->boardPaint:Landroid/graphics/Paint;

    .line 48
    .line 49
    const-string v1, "#3399FF"

    .line 50
    .line 51
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->boardPaint:Landroid/graphics/Paint;

    .line 59
    .line 60
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->boardPaint:Landroid/graphics/Paint;

    .line 66
    .line 67
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->boardPaint:Landroid/graphics/Paint;

    .line 73
    .line 74
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->boardPaint:Landroid/graphics/Paint;

    .line 80
    .line 81
    const/high16 v1, 0x40400000    # 3.0f

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 84
    .line 85
    .line 86
    new-instance v0, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Lcom/zykj/paint/SketchSyncView;->sketchControls:Ljava/util/ArrayList;

    .line 92
    .line 93
    new-instance v0, Lcom/zykj/paint/record/control/PenControl;

    .line 94
    .line 95
    iget v1, p0, Lcom/zykj/paint/SketchSyncView;->mDefaultSize:I

    .line 96
    .line 97
    iget v2, p0, Lcom/zykj/paint/SketchSyncView;->mStrokeColor:I

    .line 98
    .line 99
    invoke-direct {v0, v1, v2}, Lcom/zykj/paint/record/control/PenControl;-><init>(II)V

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, Lcom/zykj/paint/SketchSyncView;->tempPenControl:Lcom/zykj/paint/record/control/PenControl;

    .line 103
    .line 104
    new-instance v0, Lcom/zykj/paint/record/model/MapSnapShot;

    .line 105
    .line 106
    invoke-direct {v0, p0}, Lcom/zykj/paint/record/model/MapSnapShot;-><init>(Lcom/zykj/paint/SketchSyncView;)V

    .line 107
    .line 108
    .line 109
    iput-object v0, p0, Lcom/zykj/paint/SketchSyncView;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 110
    .line 111
    new-instance v1, Lcom/zykj/paint/record/control/MapControl;

    .line 112
    .line 113
    iget-object v2, p0, Lcom/zykj/paint/SketchSyncView;->sketchControls:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {v1, v0, v2}, Lcom/zykj/paint/record/control/MapControl;-><init>(Lcom/zykj/paint/record/model/MapSnapShot;Ljava/util/ArrayList;)V

    .line 116
    .line 117
    .line 118
    iput-object v1, p0, Lcom/zykj/paint/SketchSyncView;->mapSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 119
    .line 120
    iput-object v1, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 121
    .line 122
    return-void
.end method


# virtual methods
.method public addAction(Lcom/zykj/paint/Actions$EzyAction$Builder;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->ezyActionList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/paint/Actions$EzyActionList$Builder;->addAction(Lcom/zykj/paint/Actions$EzyAction$Builder;)Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 4
    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/paint/SketchSyncView;->graphId:I

    .line 7
    .line 8
    add-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/paint/SketchSyncView;->graphId:I

    .line 11
    .line 12
    return-void
.end method

.method public addMatrixAction(Lcom/zykj/paint/Actions$EzyAction$Builder;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/zykj/paint/SketchSyncView;->isRecord:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Lcom/zykj/paint/SketchSyncView;->mStartTime:J

    .line 10
    .line 11
    sub-long/2addr v0, v2

    .line 12
    :goto_0
    long-to-int v0, v0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-wide v0, p0, Lcom/zykj/paint/SketchSyncView;->timeRecord:J

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :goto_1
    invoke-virtual {p1, v0}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setStartAt(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 18
    .line 19
    .line 20
    sget v0, Lcom/zykj/paint/exchange/ActionType;->ImageMove:I

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setActionType(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->ezyActionList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lcom/zykj/paint/Actions$EzyActionList$Builder;->addAction(Lcom/zykj/paint/Actions$EzyAction$Builder;)Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public addPenTempPolylinePoint(Landroid/view/MotionEvent;)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/zykj/paint/Actions$EzyPoint;->newBuilder()Lcom/zykj/paint/Actions$EzyPoint$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    float-to-double v1, v1

    .line 10
    invoke-virtual {v0, v1, v2}, Lcom/zykj/paint/Actions$EzyPoint$Builder;->setX(D)Lcom/zykj/paint/Actions$EzyPoint$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    float-to-double v2, p1

    .line 19
    invoke-virtual {v1, v2, v3}, Lcom/zykj/paint/Actions$EzyPoint$Builder;->setY(D)Lcom/zykj/paint/Actions$EzyPoint$Builder;

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/zykj/paint/SketchSyncView;->tempPolyline:Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->addPoints(Lcom/zykj/paint/Actions$EzyPoint$Builder;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public addSketchAction(Lcom/google/protobuf/Any;I)V
    .locals 6

    .line 1
    invoke-static {}, Lcom/zykj/paint/Actions$EzyAction;->newBuilder()Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, p0, Lcom/zykj/paint/SketchSyncView;->isRecord:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v1, p0, Lcom/zykj/paint/SketchSyncView;->mCurrentStartAt:J

    .line 10
    .line 11
    iget-wide v3, p0, Lcom/zykj/paint/SketchSyncView;->mStartTime:J

    .line 12
    .line 13
    sub-long/2addr v1, v3

    .line 14
    long-to-int v1, v1

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    iget-wide v4, p0, Lcom/zykj/paint/SketchSyncView;->mCurrentStartAt:J

    .line 20
    .line 21
    sub-long/2addr v2, v4

    .line 22
    long-to-int v2, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-wide v1, p0, Lcom/zykj/paint/SketchSyncView;->timeRecord:J

    .line 25
    .line 26
    long-to-int v1, v1

    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    invoke-virtual {v0, v1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setStartAt(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setDuration(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setData(Lcom/google/protobuf/Any;)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 35
    .line 36
    .line 37
    iget p1, p0, Lcom/zykj/paint/SketchSyncView;->graphId:I

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setGraphId(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p2}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setActionType(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/paint/SketchSyncView;->ezyActionList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Lcom/zykj/paint/Actions$EzyActionList$Builder;->addAction(Lcom/zykj/paint/Actions$EzyAction$Builder;)Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 48
    .line 49
    .line 50
    iget p1, p0, Lcom/zykj/paint/SketchSyncView;->graphId:I

    .line 51
    .line 52
    add-int/lit8 p1, p1, 0x1

    .line 53
    .line 54
    iput p1, p0, Lcom/zykj/paint/SketchSyncView;->graphId:I

    .line 55
    .line 56
    return-void
.end method

.method public addSketchImage(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->sketchControls:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x5

    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/paint/SketchSyncView;->context:Landroid/app/Activity;

    .line 11
    .line 12
    const-string p2, "Add a maximum of 5 images"

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iput-wide v0, p0, Lcom/zykj/paint/SketchSyncView;->mCurrentStartAt:J

    .line 28
    .line 29
    new-instance v0, Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 30
    .line 31
    iget v1, p0, Lcom/zykj/paint/SketchSyncView;->graphId:I

    .line 32
    .line 33
    iget-object v2, p0, Lcom/zykj/paint/SketchSyncView;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 34
    .line 35
    invoke-direct {v0, p0, v1, p1, v2}, Lcom/zykj/paint/record/model/PictureSnapShot;-><init>(Lcom/zykj/paint/SketchSyncView;ILandroid/graphics/Bitmap;Lcom/zykj/paint/record/model/MapSnapShot;)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Lcom/zykj/paint/record/control/PictureControl;

    .line 39
    .line 40
    iget-object v2, p0, Lcom/zykj/paint/SketchSyncView;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 41
    .line 42
    iget-object v2, v2, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchMatrix:Landroid/graphics/Matrix;

    .line 43
    .line 44
    invoke-direct {v1, v0, v2}, Lcom/zykj/paint/record/control/PictureControl;-><init>(Lcom/zykj/paint/record/model/GraphSnapShot;Landroid/graphics/Matrix;)V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 48
    .line 49
    iget-object v2, p0, Lcom/zykj/paint/SketchSyncView;->sketchControls:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView;->sketchControls:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-lez v1, :cond_1

    .line 61
    .line 62
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView;->sketchControls:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    add-int/lit8 v1, v1, -0x1

    .line 69
    .line 70
    invoke-virtual {p0, v1, v0}, Lcom/zykj/paint/SketchSyncView;->updateSelectedStatus(ILcom/zykj/paint/record/model/GraphSnapShot;)V

    .line 71
    .line 72
    .line 73
    iput v1, p0, Lcom/zykj/paint/SketchSyncView;->lastSelectIndex:I

    .line 74
    .line 75
    :cond_1
    iget-boolean v0, p0, Lcom/zykj/paint/SketchSyncView;->isInitSuccess:Z

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/zykj/paint/SketchSyncView;->updateSnapshot()V

    .line 80
    .line 81
    .line 82
    :cond_2
    invoke-static {}, Lcom/zykj/paint/Actions$NewImageData;->newBuilder()Lcom/zykj/paint/Actions$NewImageData$Builder;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0, p2}, Lcom/zykj/paint/Actions$NewImageData$Builder;->setSrc(Ljava/lang/String;)Lcom/zykj/paint/Actions$NewImageData$Builder;

    .line 87
    .line 88
    .line 89
    invoke-static {}, Lcom/zykj/paint/Actions$EzySize;->newBuilder()Lcom/zykj/paint/Actions$EzySize$Builder;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-virtual {p2, v1}, Lcom/zykj/paint/Actions$EzySize$Builder;->setWidth(I)Lcom/zykj/paint/Actions$EzySize$Builder;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-virtual {p2, p1}, Lcom/zykj/paint/Actions$EzySize$Builder;->setHeight(I)Lcom/zykj/paint/Actions$EzySize$Builder;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzySize$Builder;->build()Lcom/zykj/paint/Actions$EzySize;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {v0, p1}, Lcom/zykj/paint/Actions$NewImageData$Builder;->setSize(Lcom/zykj/paint/Actions$EzySize;)Lcom/zykj/paint/Actions$NewImageData$Builder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewImageData$Builder;->build()Lcom/zykj/paint/Actions$NewImageData;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-static {p1}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    sget p2, Lcom/zykj/paint/exchange/ActionType;->ImageNew:I

    .line 125
    .line 126
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/SketchSyncView;->addSketchAction(Lcom/google/protobuf/Any;I)V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public clear()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/zykj/paint/SketchSyncView;->lastSelectIndex:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->sketchControls:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/paint/record/model/MapSnapShot;->clear()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public clearCanvas(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 3
    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public createLayer(I)Lcom/zykj/paint/Actions$EzyAction;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/paint/Actions$NewLayerData;->newBuilder()Lcom/zykj/paint/Actions$NewLayerData$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/zykj/paint/Actions$EzyColor;->newBuilder()Lcom/zykj/paint/Actions$EzyColor$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0xff

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lcom/zykj/paint/Actions$EzyColor$Builder;->setRed(I)Lcom/zykj/paint/Actions$EzyColor$Builder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lcom/zykj/paint/Actions$EzyColor$Builder;->setGreen(I)Lcom/zykj/paint/Actions$EzyColor$Builder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Lcom/zykj/paint/Actions$EzyColor$Builder;->setBlue(I)Lcom/zykj/paint/Actions$EzyColor$Builder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lcom/zykj/paint/Actions$EzyColor$Builder;->setAlpha(I)Lcom/zykj/paint/Actions$EzyColor$Builder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$EzyColor$Builder;->build()Lcom/zykj/paint/Actions$EzyColor;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Lcom/zykj/paint/Actions$NewLayerData$Builder;->setColor(Lcom/zykj/paint/Actions$EzyColor;)Lcom/zykj/paint/Actions$NewLayerData$Builder;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/zykj/paint/Actions$EzyAction;->newBuilder()Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget v2, p0, Lcom/zykj/paint/SketchSyncView;->graphId:I

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setGraphId(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setStartAt(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 40
    .line 41
    .line 42
    sget p1, Lcom/zykj/paint/exchange/ActionType;->LayerNew:I

    .line 43
    .line 44
    invoke-virtual {v1, p1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setActionType(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewLayerData$Builder;->build()Lcom/zykj/paint/Actions$NewLayerData;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v1, p1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setData(Lcom/google/protobuf/Any;)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 56
    .line 57
    .line 58
    new-instance p1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string v0, "\u589e\u52a0\u56fe\u5c42\uff0cid\u662f->"

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget v0, p0, Lcom/zykj/paint/SketchSyncView;->graphId:I

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v0, "SketchSyncView"

    .line 78
    .line 79
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    iget p1, p0, Lcom/zykj/paint/SketchSyncView;->graphId:I

    .line 83
    .line 84
    add-int/lit8 p1, p1, 0x1

    .line 85
    .line 86
    iput p1, p0, Lcom/zykj/paint/SketchSyncView;->graphId:I

    .line 87
    .line 88
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->build()Lcom/zykj/paint/Actions$EzyAction;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1
.end method

.method public delByLine(Lcom/zykj/paint/Actions$EzyActionList$Builder;FF)V
    .locals 7

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyActionList$Builder;->getActionList()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-ge v1, v2, :cond_3

    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lcom/zykj/paint/Actions$EzyAction;

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Lcom/google/protobuf/Any;->getTypeUrl()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-nez v4, :cond_2

    .line 31
    .line 32
    const-string v4, "/"

    .line 33
    .line 34
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const/4 v4, 0x1

    .line 39
    aget-object v3, v3, v4

    .line 40
    .line 41
    const-string v4, "NewPolylineData"

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const-class v3, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 60
    .line 61
    invoke-virtual {v2}, Lcom/zykj/paint/Actions$NewPolylineData;->getPointsCount()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-gtz v3, :cond_0

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_0
    float-to-double v3, p2

    .line 69
    float-to-double v5, p3

    .line 70
    invoke-static {v2, v3, v4, v5, v6}, Lcom/zykj/paint/util/LineUtils;->point2Polyline(Lcom/zykj/paint/Actions$NewPolylineData;DD)D

    .line 71
    .line 72
    .line 73
    move-result-wide v2

    .line 74
    const-wide/high16 v4, 0x4049000000000000L    # 50.0

    .line 75
    .line 76
    cmpg-double v2, v2, v4

    .line 77
    .line 78
    if-gez v2, :cond_2

    .line 79
    .line 80
    invoke-static {}, Lcom/zykj/paint/Actions$EzyAction;->newBuilder()Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    iget-boolean v3, p0, Lcom/zykj/paint/SketchSyncView;->isRecord:Z

    .line 85
    .line 86
    if-eqz v3, :cond_1

    .line 87
    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    iget-wide v5, p0, Lcom/zykj/paint/SketchSyncView;->mStartTime:J

    .line 93
    .line 94
    sub-long/2addr v3, v5

    .line 95
    :goto_1
    long-to-int v3, v3

    .line 96
    goto :goto_2

    .line 97
    :catch_0
    move-exception p1

    .line 98
    goto :goto_4

    .line 99
    :cond_1
    iget-wide v3, p0, Lcom/zykj/paint/SketchSyncView;->timeRecord:J

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :goto_2
    invoke-virtual {v2, v3}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setStartAt(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 103
    .line 104
    .line 105
    sget v3, Lcom/zykj/paint/exchange/ActionType;->PolylineDel:I

    .line 106
    .line 107
    invoke-virtual {v2, v3}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setActionType(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 108
    .line 109
    .line 110
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    check-cast v3, Lcom/zykj/paint/Actions$EzyAction;

    .line 115
    .line 116
    invoke-virtual {v3}, Lcom/zykj/paint/Actions$EzyAction;->getGraphId()I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    invoke-virtual {v2, v3}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setGraphId(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 121
    .line 122
    .line 123
    const-string v3, "SketchSyncView"

    .line 124
    .line 125
    new-instance v4, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string v5, "\u5220\u6389\u7684 id \u662f------>>>>>>>"

    .line 131
    .line 132
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    check-cast v5, Lcom/zykj/paint/Actions$EzyAction;

    .line 140
    .line 141
    invoke-virtual {v5}, Lcom/zykj/paint/Actions$EzyAction;->getGraphId()I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    iget-object v3, p0, Lcom/zykj/paint/SketchSyncView;->ezyActionList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 156
    .line 157
    invoke-virtual {v2}, Lcom/zykj/paint/Actions$EzyAction$Builder;->build()Lcom/zykj/paint/Actions$EzyAction;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v3, v2}, Lcom/zykj/paint/Actions$EzyActionList$Builder;->addAction(Lcom/zykj/paint/Actions$EzyAction;)Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, v1}, Lcom/zykj/paint/Actions$EzyActionList$Builder;->removeAction(I)Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 165
    .line 166
    .line 167
    :cond_2
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method public erase()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/SketchSyncView;->clear()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/zykj/paint/Actions$EzyAction;->newBuilder()Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-boolean v1, p0, Lcom/zykj/paint/SketchSyncView;->isRecord:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    iget-wide v3, p0, Lcom/zykj/paint/SketchSyncView;->mStartTime:J

    .line 17
    .line 18
    sub-long/2addr v1, v3

    .line 19
    :goto_0
    long-to-int v1, v1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-wide v1, p0, Lcom/zykj/paint/SketchSyncView;->timeRecord:J

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :goto_1
    invoke-virtual {v0, v1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setStartAt(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 25
    .line 26
    .line 27
    sget v1, Lcom/zykj/paint/exchange/ActionType;->ClearMap:I

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setActionType(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView;->ezyActionList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyAction$Builder;->build()Lcom/zykj/paint/Actions$EzyAction;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v1, v0}, Lcom/zykj/paint/Actions$EzyActionList$Builder;->addAction(Lcom/zykj/paint/Actions$EzyAction;)Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public getTimeRecord()J
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/zykj/paint/SketchSyncView;->isRecord:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Lcom/zykj/paint/SketchSyncView;->timeRecord:J

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-wide v2, p0, Lcom/zykj/paint/SketchSyncView;->mStartTime:J

    .line 13
    .line 14
    sub-long/2addr v0, v2

    .line 15
    return-wide v0
.end method

.method public getViewContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->context:Landroid/app/Activity;

    .line 2
    .line 3
    return-object v0
.end method

.method public initRecord()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->ezyActionList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyActionList$Builder;->clear()Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->ezyActionList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, v1}, Lcom/zykj/paint/SketchSyncView;->createLayer(I)Lcom/zykj/paint/Actions$EzyAction;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lcom/zykj/paint/Actions$EzyActionList$Builder;->addAction(Lcom/zykj/paint/Actions$EzyAction;)Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public isTouchable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/paint/SketchSyncView;->isTouchable:Z

    .line 2
    .line 3
    return v0
.end method

.method public onDestroy()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->sketchControls:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    :goto_0
    if-ge v1, v0, :cond_0

    .line 9
    .line 10
    iget-object v2, p0, Lcom/zykj/paint/SketchSyncView;->sketchControls:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lcom/zykj/paint/record/control/ISketchControl;

    .line 17
    .line 18
    invoke-interface {v2}, Lcom/zykj/paint/record/control/ISketchControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Lcom/zykj/paint/record/model/GraphSnapShot;->release()V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/zykj/paint/record/model/GraphSnapShot;->release()V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->mCoverBitmap:Landroid/graphics/Bitmap;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->mCoverBitmap:Landroid/graphics/Bitmap;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, Lcom/zykj/paint/SketchSyncView;->mCoverBitmap:Landroid/graphics/Bitmap;

    .line 52
    .line 53
    :cond_1
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->mBaseBitmap:Landroid/graphics/Bitmap;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_2

    .line 62
    .line 63
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->mBaseBitmap:Landroid/graphics/Bitmap;

    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 66
    .line 67
    .line 68
    iput-object v1, p0, Lcom/zykj/paint/SketchSyncView;->mBaseBitmap:Landroid/graphics/Bitmap;

    .line 69
    .line 70
    :cond_2
    invoke-static {}, Ljava/lang/System;->gc()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 5
    .line 6
    iget-object v1, v0, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {p1, v1, v0, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->mBaseBitmap:Landroid/graphics/Bitmap;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 17
    .line 18
    iget-object v1, v1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 21
    .line 22
    .line 23
    iget v0, p0, Lcom/zykj/paint/SketchSyncView;->lastSelectIndex:I

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView;->sketchControls:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/zykj/paint/record/control/ISketchControl;

    .line 35
    .line 36
    invoke-interface {v0}, Lcom/zykj/paint/record/control/ISketchControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 43
    .line 44
    instance-of v1, v1, Lcom/zykj/paint/record/control/MapControl;

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    iget-object v0, v0, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 49
    .line 50
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 51
    .line 52
    iget-object v1, v1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 53
    .line 54
    iget-object v3, p0, Lcom/zykj/paint/SketchSyncView;->mPaint:Landroid/graphics/Paint;

    .line 55
    .line 56
    invoke-virtual {p1, v0, v1, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    iget-object v1, v0, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 61
    .line 62
    iget-object v0, v0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 63
    .line 64
    iget-object v3, p0, Lcom/zykj/paint/SketchSyncView;->mPaint:Landroid/graphics/Paint;

    .line 65
    .line 66
    invoke-virtual {p1, v1, v0, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->mCoverBitmap:Landroid/graphics/Bitmap;

    .line 70
    .line 71
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 72
    .line 73
    iget-object v1, v1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 74
    .line 75
    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->tempPenControl:Lcom/zykj/paint/record/control/PenControl;

    .line 79
    .line 80
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView;->boardPaint:Landroid/graphics/Paint;

    .line 81
    .line 82
    invoke-virtual {v0, p1, v1}, Lcom/zykj/paint/record/control/PenControl;->draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    if-eq v1, v0, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    invoke-direct {p0, p1}, Lcom/zykj/paint/SketchSyncView;->handleEvent(Landroid/view/MotionEvent;)V

    .line 14
    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    iput-wide v3, p0, Lcom/zykj/paint/SketchSyncView;->touchDownTime:J

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v3, 0x5

    .line 35
    if-ne v1, v3, :cond_3

    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    iget-wide v5, p0, Lcom/zykj/paint/SketchSyncView;->touchDownTime:J

    .line 42
    .line 43
    sub-long/2addr v3, v5

    .line 44
    const-wide/16 v5, 0x1f4

    .line 45
    .line 46
    cmp-long v1, v3, v5

    .line 47
    .line 48
    if-gez v1, :cond_3

    .line 49
    .line 50
    iput-boolean v2, p0, Lcom/zykj/paint/SketchSyncView;->isMultiMode:Z

    .line 51
    .line 52
    :cond_3
    :goto_0
    iget-boolean v1, p0, Lcom/zykj/paint/SketchSyncView;->isTouchable:Z

    .line 53
    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    iget-boolean v1, p0, Lcom/zykj/paint/SketchSyncView;->isMultiMode:Z

    .line 57
    .line 58
    if-nez v1, :cond_4

    .line 59
    .line 60
    invoke-direct {p0, p1}, Lcom/zykj/paint/SketchSyncView;->handleEvent(Landroid/view/MotionEvent;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    iget v1, p0, Lcom/zykj/paint/SketchSyncView;->actionMode:I

    .line 65
    .line 66
    if-ne v1, v2, :cond_5

    .line 67
    .line 68
    invoke-direct {p0, p1}, Lcom/zykj/paint/SketchSyncView;->handleMultiFingerEvent(Landroid/view/MotionEvent;)V

    .line 69
    .line 70
    .line 71
    :cond_5
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-ne p1, v2, :cond_6

    .line 76
    .line 77
    iput-boolean v0, p0, Lcom/zykj/paint/SketchSyncView;->isMultiMode:Z

    .line 78
    .line 79
    iget-object p1, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 80
    .line 81
    instance-of p1, p1, Lcom/zykj/paint/record/control/MapControl;

    .line 82
    .line 83
    if-eqz p1, :cond_6

    .line 84
    .line 85
    new-instance p1, Lcom/zykj/paint/record/control/DefaultControl;

    .line 86
    .line 87
    invoke-direct {p1}, Lcom/zykj/paint/record/control/DefaultControl;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object p1, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 91
    .line 92
    :cond_6
    :goto_2
    return v2
.end method

.method public pauseRecord()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/paint/SketchSyncView;->isRecord:Z

    .line 3
    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iget-wide v2, p0, Lcom/zykj/paint/SketchSyncView;->mStartTime:J

    .line 9
    .line 10
    sub-long/2addr v0, v2

    .line 11
    iput-wide v0, p0, Lcom/zykj/paint/SketchSyncView;->timeRecord:J

    .line 12
    .line 13
    return-void
.end method

.method public reRecord(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->ezyActionList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyActionList$Builder;->clear()Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->mBaseCanvas:Landroid/graphics/Canvas;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/zykj/paint/SketchSyncView;->clearCanvas(Landroid/graphics/Canvas;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/paint/SketchSyncView;->clear()V

    .line 12
    .line 13
    .line 14
    iput-wide p1, p0, Lcom/zykj/paint/SketchSyncView;->mStartTime:J

    .line 15
    .line 16
    const-wide/16 p1, 0x0

    .line 17
    .line 18
    iput-wide p1, p0, Lcom/zykj/paint/SketchSyncView;->timeRecord:J

    .line 19
    .line 20
    iget-object p1, p0, Lcom/zykj/paint/SketchSyncView;->ezyActionList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-virtual {p0, p2}, Lcom/zykj/paint/SketchSyncView;->createLayer(I)Lcom/zykj/paint/Actions$EzyAction;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p1, p2}, Lcom/zykj/paint/Actions$EzyActionList$Builder;->addAction(Lcom/zykj/paint/Actions$EzyAction;)Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public resumeRecord()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/zykj/paint/SketchSyncView;->isRecord:Z

    .line 3
    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iget-wide v2, p0, Lcom/zykj/paint/SketchSyncView;->timeRecord:J

    .line 9
    .line 10
    sub-long/2addr v0, v2

    .line 11
    iput-wide v0, p0, Lcom/zykj/paint/SketchSyncView;->mStartTime:J

    .line 12
    .line 13
    return-void
.end method

.method public saveRecord(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "SketchSyncView"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v3, "filePath-->"

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    new-instance v2, Ljava/io/File;

    .line 25
    .line 26
    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :catch_0
    move-exception p1

    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :cond_0
    :goto_0
    new-instance v2, Ljava/io/File;

    .line 46
    .line 47
    const-string v3, "actions.bin"

    .line 48
    .line 49
    invoke-direct {v2, p1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_1

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    .line 59
    .line 60
    .line 61
    const-string p1, "\u6587\u4ef6\u4e0d\u5b58\u5728,\u521b\u5efa"

    .line 62
    .line 63
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 68
    .line 69
    .line 70
    const-string p1, "\u6587\u4ef6\u5b58\u5728,\u5220\u9664"

    .line 71
    .line 72
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    :goto_1
    invoke-static {}, Lcom/zykj/paint/Actions$EzyAction;->newBuilder()Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget v3, p0, Lcom/zykj/paint/SketchSyncView;->graphId:I

    .line 80
    .line 81
    invoke-virtual {p1, v3}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setGraphId(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 82
    .line 83
    .line 84
    iget-boolean v3, p0, Lcom/zykj/paint/SketchSyncView;->isRecord:Z

    .line 85
    .line 86
    if-eqz v3, :cond_2

    .line 87
    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    iget-wide v5, p0, Lcom/zykj/paint/SketchSyncView;->mStartTime:J

    .line 93
    .line 94
    sub-long/2addr v3, v5

    .line 95
    :goto_2
    long-to-int v3, v3

    .line 96
    goto :goto_3

    .line 97
    :cond_2
    iget-wide v3, p0, Lcom/zykj/paint/SketchSyncView;->timeRecord:J

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :goto_3
    invoke-virtual {p1, v3}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setStartAt(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 101
    .line 102
    .line 103
    sget v3, Lcom/zykj/paint/exchange/ActionType;->LayerSel:I

    .line 104
    .line 105
    invoke-virtual {p1, v3}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setActionType(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 106
    .line 107
    .line 108
    iget-object v3, p0, Lcom/zykj/paint/SketchSyncView;->ezyActionList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->build()Lcom/zykj/paint/Actions$EzyAction;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {v3, p1}, Lcom/zykj/paint/Actions$EzyActionList$Builder;->addAction(Lcom/zykj/paint/Actions$EzyAction;)Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 115
    .line 116
    .line 117
    new-instance p1, Ljava/io/FileOutputStream;

    .line 118
    .line 119
    invoke-direct {p1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    .line 122
    :try_start_1
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView;->ezyActionList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 123
    .line 124
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$EzyActionList$Builder;->build()Lcom/zykj/paint/Actions$EzyActionList;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {p1, v1}, Ljava/io/FileOutputStream;->write([B)V

    .line 133
    .line 134
    .line 135
    new-instance v1, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    const-string v2, "\u4fdd\u5b58\u7684\u957f\u5ea6===>>>>>"

    .line 141
    .line 142
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    iget-object v2, p0, Lcom/zykj/paint/SketchSyncView;->ezyActionList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 146
    .line 147
    invoke-virtual {v2}, Lcom/zykj/paint/Actions$EzyActionList$Builder;->getActionList()Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 163
    .line 164
    .line 165
    :try_start_2
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :catchall_1
    move-exception v0

    .line 170
    move-object v1, p1

    .line 171
    move-object p1, v0

    .line 172
    goto :goto_5

    .line 173
    :catch_1
    move-exception v0

    .line 174
    move-object v1, p1

    .line 175
    move-object p1, v0

    .line 176
    :goto_4
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 177
    .line 178
    .line 179
    if-eqz v1, :cond_3

    .line 180
    .line 181
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 182
    .line 183
    .line 184
    :catch_2
    :cond_3
    return-void

    .line 185
    :goto_5
    if-eqz v1, :cond_4

    .line 186
    .line 187
    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 188
    .line 189
    .line 190
    :catch_3
    :cond_4
    throw p1
.end method

.method public setActionMode(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/zykj/paint/SketchSyncView;->actionMode:I

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/paint/SketchSyncView;->mapSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance p1, Lcom/zykj/paint/record/control/DefaultControl;

    .line 12
    .line 13
    invoke-direct {p1}, Lcom/zykj/paint/record/control/DefaultControl;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public setContext(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/SketchSyncView;->context:Landroid/app/Activity;

    .line 2
    .line 3
    return-void
.end method

.method public setPaint(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "setPaint--->>>"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "SketchSyncView"

    .line 19
    .line 20
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->boardPaint:Landroid/graphics/Paint;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public setSelectSketchControl(Landroid/view/MotionEvent;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/zykj/paint/SketchSyncView;->isCurrentSketchSticky:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->sketchControls:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    sub-int/2addr v0, v1

    .line 14
    :goto_0
    const-string v2, "SketchSyncView"

    .line 15
    .line 16
    if-ltz v0, :cond_2

    .line 17
    .line 18
    iget-object v3, p0, Lcom/zykj/paint/SketchSyncView;->sketchControls:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lcom/zykj/paint/record/control/ISketchControl;

    .line 25
    .line 26
    invoke-interface {v3}, Lcom/zykj/paint/record/control/ISketchControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    iget-object v5, v4, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchBitmap:Landroid/graphics/Bitmap;

    .line 31
    .line 32
    iget-object v6, v4, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchMatrix:Landroid/graphics/Matrix;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    invoke-virtual {v4, v5, v6, v7, v8}, Lcom/zykj/paint/record/model/GraphSnapShot;->isInGraphRect(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;FF)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_1

    .line 47
    .line 48
    iput-object v3, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 49
    .line 50
    invoke-virtual {p0, v0, v4}, Lcom/zykj/paint/SketchSyncView;->updateSelectedStatus(ILcom/zykj/paint/record/model/GraphSnapShot;)V

    .line 51
    .line 52
    .line 53
    iput v0, p0, Lcom/zykj/paint/SketchSyncView;->lastSelectIndex:I

    .line 54
    .line 55
    iput-boolean v1, p0, Lcom/zykj/paint/SketchSyncView;->isCurrentSketchSticky:Z

    .line 56
    .line 57
    new-instance p1, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v3, "\u9009\u4e2dPicture [index="

    .line 63
    .line 64
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v0, "]"

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    :goto_1
    iget-boolean p1, p0, Lcom/zykj/paint/SketchSyncView;->isCurrentSketchSticky:Z

    .line 87
    .line 88
    if-nez p1, :cond_4

    .line 89
    .line 90
    iget p1, p0, Lcom/zykj/paint/SketchSyncView;->actionMode:I

    .line 91
    .line 92
    if-eq p1, v1, :cond_3

    .line 93
    .line 94
    const/4 v0, 0x3

    .line 95
    if-ne p1, v0, :cond_4

    .line 96
    .line 97
    :cond_3
    iget-object p1, p0, Lcom/zykj/paint/SketchSyncView;->mapSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 98
    .line 99
    iput-object p1, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 100
    .line 101
    const-string p1, "\u9009\u4e2dMap [\u7ed8\u56fe\u63a7\u5236\u6743\u4ea4\u7ed9\u5730\u56fe]"

    .line 102
    .line 103
    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    :cond_4
    iget-object p1, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 107
    .line 108
    instance-of p1, p1, Lcom/zykj/paint/record/control/PictureControl;

    .line 109
    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/zykj/paint/SketchSyncView;->updateSnapshot()V

    .line 113
    .line 114
    .line 115
    :cond_5
    :goto_2
    return-void
.end method

.method public setTouchable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/paint/SketchSyncView;->isTouchable:Z

    .line 2
    .line 3
    return-void
.end method

.method public updateSelectedStatus(ILcom/zykj/paint/record/model/GraphSnapShot;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/paint/SketchSyncView;->lastSelectIndex:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 p1, -0x1

    .line 7
    if-eq v0, p1, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lcom/zykj/paint/SketchSyncView;->sketchControls:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcom/zykj/paint/record/control/ISketchControl;

    .line 16
    .line 17
    invoke-interface {p1}, Lcom/zykj/paint/record/control/ISketchControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p1, v0}, Lcom/zykj/paint/record/model/GraphSnapShot;->setSelect(Z)V

    .line 23
    .line 24
    .line 25
    :cond_1
    const/4 p1, 0x1

    .line 26
    invoke-virtual {p2, p1}, Lcom/zykj/paint/record/model/GraphSnapShot;->setSelect(Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public updateSnapshot()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->iSketchControl:Lcom/zykj/paint/record/control/ISketchControl;

    .line 2
    .line 3
    instance-of v0, v0, Lcom/zykj/paint/record/control/PictureControl;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lcom/zykj/paint/SketchSyncView;->lastRenderIndex:I

    .line 8
    .line 9
    iget v1, p0, Lcom/zykj/paint/SketchSyncView;->lastSelectIndex:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/SketchSyncView;->sketchControls:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v2, "updateSnapshot---->>>>>[lastSelectIndex="

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget v2, p0, Lcom/zykj/paint/SketchSyncView;->lastSelectIndex:I

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, "][size="

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, "]"

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v2, "SketchSyncView"

    .line 53
    .line 54
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView;->mBaseCanvas:Landroid/graphics/Canvas;

    .line 58
    .line 59
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    invoke-virtual {v1, v4, v3}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 63
    .line 64
    .line 65
    move v1, v4

    .line 66
    :goto_0
    iget v3, p0, Lcom/zykj/paint/SketchSyncView;->lastSelectIndex:I

    .line 67
    .line 68
    const/4 v5, 0x0

    .line 69
    const/4 v6, 0x0

    .line 70
    if-ge v1, v3, :cond_1

    .line 71
    .line 72
    const-string v3, "[\u753b\u539f\u59cb\u56fe]---->>>>>mBaseCanvas"

    .line 73
    .line 74
    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    iget-object v3, p0, Lcom/zykj/paint/SketchSyncView;->sketchControls:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, Lcom/zykj/paint/record/control/ISketchControl;

    .line 84
    .line 85
    invoke-interface {v3}, Lcom/zykj/paint/record/control/ISketchControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    iget-object v7, p0, Lcom/zykj/paint/SketchSyncView;->mBaseCanvas:Landroid/graphics/Canvas;

    .line 90
    .line 91
    iget-object v3, v3, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 92
    .line 93
    invoke-virtual {v7, v3, v6, v6, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 94
    .line 95
    .line 96
    add-int/lit8 v1, v1, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    iget-object v1, p0, Lcom/zykj/paint/SketchSyncView;->mCoverCanvas:Landroid/graphics/Canvas;

    .line 100
    .line 101
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 102
    .line 103
    invoke-virtual {v1, v4, v3}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 104
    .line 105
    .line 106
    iget v1, p0, Lcom/zykj/paint/SketchSyncView;->lastSelectIndex:I

    .line 107
    .line 108
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 109
    .line 110
    if-ge v1, v0, :cond_2

    .line 111
    .line 112
    const-string v3, "[\u753b\u539f\u59cb\u56fe]---->>>>>mCoverCanvas"

    .line 113
    .line 114
    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    iget-object v3, p0, Lcom/zykj/paint/SketchSyncView;->sketchControls:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, Lcom/zykj/paint/record/control/ISketchControl;

    .line 124
    .line 125
    invoke-interface {v3}, Lcom/zykj/paint/record/control/ISketchControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    iget-object v4, p0, Lcom/zykj/paint/SketchSyncView;->mCoverCanvas:Landroid/graphics/Canvas;

    .line 130
    .line 131
    iget-object v3, v3, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 132
    .line 133
    invoke-virtual {v4, v3, v6, v6, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_2
    iget v0, p0, Lcom/zykj/paint/SketchSyncView;->lastSelectIndex:I

    .line 138
    .line 139
    iput v0, p0, Lcom/zykj/paint/SketchSyncView;->lastRenderIndex:I

    .line 140
    .line 141
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 142
    .line 143
    .line 144
    return-void
.end method
