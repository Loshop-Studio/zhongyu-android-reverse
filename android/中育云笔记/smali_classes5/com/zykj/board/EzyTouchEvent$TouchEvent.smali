# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyTouchEvent$TouchEvent;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyTouchEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TouchEvent"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;,
        Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;,
        Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    }
.end annotation


# static fields
.field public static final k:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

.field public static final l:Lcom/google/protobuf/Parser;


# instance fields
.field public c:J

.field public d:I

.field public e:F

.field public f:F

.field public g:I

.field public h:Ljava/util/List;

.field public i:Ljava/util/List;

.field public j:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->k:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->l:Lcom/google/protobuf/Parser;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 9
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const-wide/16 v0, 0x0

    .line 10
    iput-wide v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->c:J

    const/4 v0, 0x0

    .line 11
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->d:I

    const/4 v1, 0x0

    .line 12
    iput v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->e:F

    .line 13
    iput v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->f:F

    .line 14
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->g:I

    const/4 v0, -0x1

    .line 15
    iput-byte v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->j:B

    .line 16
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->h:Ljava/util/List;

    .line 17
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->i:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 2

    .line 2
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->c:J

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->d:I

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->e:F

    .line 6
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->f:F

    .line 7
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->g:I

    const/4 p1, -0x1

    .line 8
    iput-byte p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->j:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyTouchEvent$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2600()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic c(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic d(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic f(Lcom/zykj/board/EzyTouchEvent$TouchEvent;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->c:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic g(Lcom/zykj/board/EzyTouchEvent$TouchEvent;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->d:I

    .line 2
    .line 3
    return p1
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent;->a()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic k(Lcom/zykj/board/EzyTouchEvent$TouchEvent;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->e:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic m(Lcom/zykj/board/EzyTouchEvent$TouchEvent;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->f:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic n(Lcom/zykj/board/EzyTouchEvent$TouchEvent;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->g:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic o()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static p()Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->k:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    return-object v0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->l:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public static u()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->k:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->z()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_1
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    cmp-long v1, v1, v3

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getAction()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getAction()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eq v1, v3, :cond_3

    .line 39
    .line 40
    return v2

    .line 41
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eq v1, v3, :cond_4

    .line 58
    .line 59
    return v2

    .line 60
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eq v1, v3, :cond_5

    .line 77
    .line 78
    return v2

    .line 79
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCount()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCount()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eq v1, v3, :cond_6

    .line 88
    .line 89
    return v2

    .line 90
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerPropertiesList()Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerPropertiesList()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_7

    .line 103
    .line 104
    return v2

    .line 105
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCoordsList()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCoordsList()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-nez v1, :cond_8

    .line 118
    .line 119
    return v2

    .line 120
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-nez p1, :cond_9

    .line 133
    .line 134
    return v2

    .line 135
    :cond_9
    return v0
.end method

.method public getAction()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->r()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->r()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public getEventTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->l:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPointerCoordsCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->i:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getPointerCoordsList()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPointerCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public getPointerPropertiesCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->h:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getPointerPropertiesList()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSerializedSize()I
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget-wide v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->c:J

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-static {v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move v0, v3

    .line 23
    :goto_0
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->d:I

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    add-int/2addr v0, v1

    .line 33
    :cond_2
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->e:F

    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    const/4 v1, 0x3

    .line 42
    iget v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->e:F

    .line 43
    .line 44
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/2addr v0, v1

    .line 49
    :cond_3
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->f:F

    .line 50
    .line 51
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    const/4 v1, 0x4

    .line 58
    iget v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->f:F

    .line 59
    .line 60
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/2addr v0, v1

    .line 65
    :cond_4
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->g:I

    .line 66
    .line 67
    if-eqz v1, :cond_5

    .line 68
    .line 69
    const/4 v2, 0x5

    .line 70
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    add-int/2addr v0, v1

    .line 75
    :cond_5
    move v1, v3

    .line 76
    :goto_1
    iget-object v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->h:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-ge v1, v2, :cond_6

    .line 83
    .line 84
    iget-object v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->h:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 91
    .line 92
    const/4 v4, 0x6

    .line 93
    invoke-static {v4, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    add-int/2addr v0, v2

    .line 98
    add-int/lit8 v1, v1, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_6
    :goto_2
    iget-object v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->i:Ljava/util/List;

    .line 102
    .line 103
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-ge v3, v1, :cond_7

    .line 108
    .line 109
    iget-object v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->i:Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, Lcom/google/protobuf/MessageLite;

    .line 116
    .line 117
    const/4 v2, 0x7

    .line 118
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    add-int/2addr v0, v1

    .line 123
    add-int/lit8 v3, v3, 0x1

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    add-int/2addr v0, v1

    .line 135
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 136
    .line 137
    return v0
.end method

.method public getX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public getY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->f:F

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0x30b

    .line 15
    .line 16
    add-int/2addr v1, v0

    .line 17
    mul-int/lit8 v1, v1, 0x25

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    mul-int/lit8 v1, v1, 0x35

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    invoke-static {v2, v3}, Lcom/google/protobuf/Internal;->hashLong(J)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/2addr v1, v0

    .line 32
    mul-int/lit8 v1, v1, 0x25

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x2

    .line 35
    .line 36
    mul-int/lit8 v1, v1, 0x35

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getAction()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/2addr v1, v0

    .line 43
    mul-int/lit8 v1, v1, 0x25

    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x3

    .line 46
    .line 47
    mul-int/lit8 v1, v1, 0x35

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    add-int/2addr v1, v0

    .line 58
    mul-int/lit8 v1, v1, 0x25

    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x4

    .line 61
    .line 62
    mul-int/lit8 v1, v1, 0x35

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    add-int/2addr v1, v0

    .line 73
    mul-int/lit8 v1, v1, 0x25

    .line 74
    .line 75
    add-int/lit8 v1, v1, 0x5

    .line 76
    .line 77
    mul-int/lit8 v1, v1, 0x35

    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCount()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    add-int/2addr v1, v0

    .line 84
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerPropertiesCount()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-lez v0, :cond_1

    .line 89
    .line 90
    mul-int/lit8 v1, v1, 0x25

    .line 91
    .line 92
    add-int/lit8 v1, v1, 0x6

    .line 93
    .line 94
    mul-int/lit8 v1, v1, 0x35

    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerPropertiesList()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    add-int/2addr v1, v0

    .line 105
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCoordsCount()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-lez v0, :cond_2

    .line 110
    .line 111
    mul-int/lit8 v1, v1, 0x25

    .line 112
    .line 113
    add-int/lit8 v1, v1, 0x7

    .line 114
    .line 115
    mul-int/lit8 v1, v1, 0x35

    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCoordsList()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    add-int/2addr v1, v0

    .line 126
    :cond_2
    mul-int/lit8 v1, v1, 0x1d

    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    add-int/2addr v1, v0

    .line 137
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 138
    .line 139
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent;->b()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->j:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_1
    iput-byte v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->j:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->v()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->y(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->v()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object v0

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public r()Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->k:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    return-object v0
.end method

.method public t(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->i:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 8
    .line 9
    return-object p1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->z()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->z()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object v0

    return-object v0
.end method

.method public v()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->u()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->c:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->d:I

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->e:F

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x3

    .line 30
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->e:F

    .line 31
    .line 32
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 33
    .line 34
    .line 35
    :cond_2
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->f:F

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    const/4 v0, 0x4

    .line 44
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->f:F

    .line 45
    .line 46
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 47
    .line 48
    .line 49
    :cond_3
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->g:I

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    const/4 v1, 0x5

    .line 54
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 55
    .line 56
    .line 57
    :cond_4
    const/4 v0, 0x0

    .line 58
    move v1, v0

    .line 59
    :goto_0
    iget-object v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->h:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-ge v1, v2, :cond_5

    .line 66
    .line 67
    iget-object v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->h:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 74
    .line 75
    const/4 v3, 0x6

    .line 76
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_5
    :goto_1
    iget-object v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->i:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-ge v0, v1, :cond_6

    .line 89
    .line 90
    iget-object v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->i:Ljava/util/List;

    .line 91
    .line 92
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Lcom/google/protobuf/MessageLite;

    .line 97
    .line 98
    const/4 v2, 0x7

    .line 99
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v0, v0, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public y(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyTouchEvent$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public z()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->k:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;-><init>(Lcom/zykj/board/EzyTouchEvent$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;-><init>(Lcom/zykj/board/EzyTouchEvent$a;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->r(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method
