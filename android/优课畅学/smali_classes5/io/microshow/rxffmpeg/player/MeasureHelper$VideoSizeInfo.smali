.class public Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/microshow/rxffmpeg/player/MeasureHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "VideoSizeInfo"
.end annotation


# instance fields
.field private mDar:F

.field private mHeight:I

.field private mWidth:I


# direct methods
.method public constructor <init>(IIF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;->mWidth:I

    .line 5
    .line 6
    iput p2, p0, Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;->mHeight:I

    .line 7
    .line 8
    iput p3, p0, Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;->mDar:F

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getDar()F
    .locals 1

    .line 1
    iget v0, p0, Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;->mDar:F

    .line 2
    .line 3
    return v0
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;->mHeight:I

    .line 2
    .line 3
    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;->mWidth:I

    .line 2
    .line 3
    return v0
.end method
