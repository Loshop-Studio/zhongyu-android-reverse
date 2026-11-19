.class public abstract Lcom/zykj/paint/record/AudioEncoder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected BIT_RATE:I

.field protected CHANNEL_COUNT:I

.field protected SAMPLE_RATE:I

.field protected destinationFile:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x1f40

    .line 5
    .line 6
    iput v0, p0, Lcom/zykj/paint/record/AudioEncoder;->SAMPLE_RATE:I

    .line 7
    .line 8
    const/16 v0, 0x40

    .line 9
    .line 10
    iput v0, p0, Lcom/zykj/paint/record/AudioEncoder;->BIT_RATE:I

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput v0, p0, Lcom/zykj/paint/record/AudioEncoder;->CHANNEL_COUNT:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public abstract encode(Ljava/lang/String;)V
.end method

.method public getDestFile()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/AudioEncoder;->destinationFile:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMediaFormat(Ljava/lang/String;)Landroid/media/MediaFormat;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Landroid/media/MediaExtractor;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/media/MediaExtractor;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/media/MediaExtractor;->setDataSource(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-virtual {v0, p1}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public init(III)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/paint/record/AudioEncoder;->SAMPLE_RATE:I

    .line 2
    .line 3
    iput p2, p0, Lcom/zykj/paint/record/AudioEncoder;->BIT_RATE:I

    .line 4
    .line 5
    iput p3, p0, Lcom/zykj/paint/record/AudioEncoder;->CHANNEL_COUNT:I

    .line 6
    .line 7
    return-void
.end method
