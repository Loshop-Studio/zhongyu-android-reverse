.class public Lcom/zykj/paint/record/WaveHeader;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public AvgBytesPerSec:I

.field public BitsPerSample:S

.field public BlockAlign:S

.field public Channels:S

.field public DataHdrID:[C

.field public DataHdrLeth:I

.field public FmtHdrID:[C

.field public FmtHdrLeth:I

.field public FormatTag:S

.field public SamplesPerSec:I

.field public final fileID:[C

.field public fileLength:I

.field public wavTag:[C


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v1, v0, [C

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lcom/zykj/paint/record/WaveHeader;->fileID:[C

    .line 11
    .line 12
    new-array v1, v0, [C

    .line 13
    .line 14
    fill-array-data v1, :array_1

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcom/zykj/paint/record/WaveHeader;->wavTag:[C

    .line 18
    .line 19
    new-array v1, v0, [C

    .line 20
    .line 21
    fill-array-data v1, :array_2

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lcom/zykj/paint/record/WaveHeader;->FmtHdrID:[C

    .line 25
    .line 26
    new-array v0, v0, [C

    .line 27
    .line 28
    fill-array-data v0, :array_3

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/zykj/paint/record/WaveHeader;->DataHdrID:[C

    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :array_0
    .array-data 2
        0x52s
        0x49s
        0x46s
        0x46s
    .end array-data

    .line 36
    .line 37
    :array_1
    .array-data 2
        0x57s
        0x41s
        0x56s
        0x45s
    .end array-data

    :array_2
    .array-data 2
        0x66s
        0x6ds
        0x74s
        0x20s
    .end array-data

    :array_3
    .array-data 2
        0x64s
        0x61s
        0x74s
        0x61s
    .end array-data
.end method

.method private WriteChar(Ljava/io/ByteArrayOutputStream;[C)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p2

    .line 3
    if-ge v0, v1, :cond_0

    .line 4
    .line 5
    aget-char v1, p2, v0

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 8
    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void
.end method

.method private WriteInt(Ljava/io/ByteArrayOutputStream;I)V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    shr-int/lit8 v1, p2, 0x18

    .line 5
    .line 6
    int-to-byte v1, v1

    .line 7
    const/4 v2, 0x3

    .line 8
    aput-byte v1, v0, v2

    .line 9
    .line 10
    shl-int/lit8 v1, p2, 0x8

    .line 11
    .line 12
    shr-int/lit8 v1, v1, 0x18

    .line 13
    .line 14
    int-to-byte v1, v1

    .line 15
    const/4 v2, 0x2

    .line 16
    aput-byte v1, v0, v2

    .line 17
    .line 18
    shl-int/lit8 v1, p2, 0x10

    .line 19
    .line 20
    shr-int/lit8 v1, v1, 0x18

    .line 21
    .line 22
    int-to-byte v1, v1

    .line 23
    const/4 v2, 0x1

    .line 24
    aput-byte v1, v0, v2

    .line 25
    .line 26
    shl-int/lit8 p2, p2, 0x18

    .line 27
    .line 28
    shr-int/lit8 p2, p2, 0x18

    .line 29
    .line 30
    int-to-byte p2, p2

    .line 31
    const/4 v1, 0x0

    .line 32
    aput-byte p2, v0, v1

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private WriteShort(Ljava/io/ByteArrayOutputStream;I)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    shl-int/lit8 v1, p2, 0x10

    .line 5
    .line 6
    shr-int/lit8 v1, v1, 0x18

    .line 7
    .line 8
    int-to-byte v1, v1

    .line 9
    const/4 v2, 0x1

    .line 10
    aput-byte v1, v0, v2

    .line 11
    .line 12
    shl-int/lit8 p2, p2, 0x18

    .line 13
    .line 14
    shr-int/lit8 p2, p2, 0x18

    .line 15
    .line 16
    int-to-byte p2, p2

    .line 17
    const/4 v1, 0x0

    .line 18
    aput-byte p2, v0, v1

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public getHeader()[B
    .locals 2

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/paint/record/WaveHeader;->fileID:[C

    .line 7
    .line 8
    invoke-direct {p0, v0, v1}, Lcom/zykj/paint/record/WaveHeader;->WriteChar(Ljava/io/ByteArrayOutputStream;[C)V

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lcom/zykj/paint/record/WaveHeader;->fileLength:I

    .line 12
    .line 13
    invoke-direct {p0, v0, v1}, Lcom/zykj/paint/record/WaveHeader;->WriteInt(Ljava/io/ByteArrayOutputStream;I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/paint/record/WaveHeader;->wavTag:[C

    .line 17
    .line 18
    invoke-direct {p0, v0, v1}, Lcom/zykj/paint/record/WaveHeader;->WriteChar(Ljava/io/ByteArrayOutputStream;[C)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/zykj/paint/record/WaveHeader;->FmtHdrID:[C

    .line 22
    .line 23
    invoke-direct {p0, v0, v1}, Lcom/zykj/paint/record/WaveHeader;->WriteChar(Ljava/io/ByteArrayOutputStream;[C)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lcom/zykj/paint/record/WaveHeader;->FmtHdrLeth:I

    .line 27
    .line 28
    invoke-direct {p0, v0, v1}, Lcom/zykj/paint/record/WaveHeader;->WriteInt(Ljava/io/ByteArrayOutputStream;I)V

    .line 29
    .line 30
    .line 31
    iget-short v1, p0, Lcom/zykj/paint/record/WaveHeader;->FormatTag:S

    .line 32
    .line 33
    invoke-direct {p0, v0, v1}, Lcom/zykj/paint/record/WaveHeader;->WriteShort(Ljava/io/ByteArrayOutputStream;I)V

    .line 34
    .line 35
    .line 36
    iget-short v1, p0, Lcom/zykj/paint/record/WaveHeader;->Channels:S

    .line 37
    .line 38
    invoke-direct {p0, v0, v1}, Lcom/zykj/paint/record/WaveHeader;->WriteShort(Ljava/io/ByteArrayOutputStream;I)V

    .line 39
    .line 40
    .line 41
    iget v1, p0, Lcom/zykj/paint/record/WaveHeader;->SamplesPerSec:I

    .line 42
    .line 43
    invoke-direct {p0, v0, v1}, Lcom/zykj/paint/record/WaveHeader;->WriteInt(Ljava/io/ByteArrayOutputStream;I)V

    .line 44
    .line 45
    .line 46
    iget v1, p0, Lcom/zykj/paint/record/WaveHeader;->AvgBytesPerSec:I

    .line 47
    .line 48
    invoke-direct {p0, v0, v1}, Lcom/zykj/paint/record/WaveHeader;->WriteInt(Ljava/io/ByteArrayOutputStream;I)V

    .line 49
    .line 50
    .line 51
    iget-short v1, p0, Lcom/zykj/paint/record/WaveHeader;->BlockAlign:S

    .line 52
    .line 53
    invoke-direct {p0, v0, v1}, Lcom/zykj/paint/record/WaveHeader;->WriteShort(Ljava/io/ByteArrayOutputStream;I)V

    .line 54
    .line 55
    .line 56
    iget-short v1, p0, Lcom/zykj/paint/record/WaveHeader;->BitsPerSample:S

    .line 57
    .line 58
    invoke-direct {p0, v0, v1}, Lcom/zykj/paint/record/WaveHeader;->WriteShort(Ljava/io/ByteArrayOutputStream;I)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lcom/zykj/paint/record/WaveHeader;->DataHdrID:[C

    .line 62
    .line 63
    invoke-direct {p0, v0, v1}, Lcom/zykj/paint/record/WaveHeader;->WriteChar(Ljava/io/ByteArrayOutputStream;[C)V

    .line 64
    .line 65
    .line 66
    iget v1, p0, Lcom/zykj/paint/record/WaveHeader;->DataHdrLeth:I

    .line 67
    .line 68
    invoke-direct {p0, v0, v1}, Lcom/zykj/paint/record/WaveHeader;->WriteInt(Ljava/io/ByteArrayOutputStream;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 79
    .line 80
    .line 81
    return-object v1
.end method
