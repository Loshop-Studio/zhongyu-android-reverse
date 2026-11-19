# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AudioStart"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    }
.end annotation


# static fields
.field public static final g:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

.field public static final h:Lcom/google/protobuf/Parser;


# instance fields
.field public volatile c:Ljava/lang/Object;

.field public d:J

.field public volatile e:Ljava/lang/Object;

.field public f:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->g:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->h:Lcom/google/protobuf/Parser;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 7
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->c:Ljava/lang/Object;

    const-wide/16 v1, 0x0

    .line 9
    iput-wide v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->d:J

    .line 10
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->e:Ljava/lang/Object;

    const/4 v1, -0x1

    .line 11
    iput-byte v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->f:B

    .line 12
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->c:Ljava/lang/Object;

    .line 13
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 2

    .line 2
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    .line 3
    const-string p1, ""

    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->c:Ljava/lang/Object;

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->d:J

    .line 5
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->e:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 6
    iput-byte p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->f:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyCommand$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->c:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->c:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic d(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->d:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic e(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->e:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->e:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->g:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand;->q()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static o()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->g:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->v()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static t(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->h:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 8
    .line 9
    return-object p0
.end method

.method public static u([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->h:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

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
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->getFileName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->getFileName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    return v2

    .line 32
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->m()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->m()J

    .line 37
    .line 38
    .line 39
    move-result-wide v5

    .line 40
    cmp-long v1, v3, v5

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    return v2

    .line 45
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->n()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->n()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_4

    .line 58
    .line 59
    return v2

    .line 60
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-nez p1, :cond_5

    .line 73
    .line 74
    return v2

    .line 75
    :cond_5
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    move-result-object v0

    return-object v0
.end method

.method public getFileName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->c:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->c:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->h:Lcom/google/protobuf/Parser;

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
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->c:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->c:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-static {v0, v1}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    iget-wide v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->d:J

    .line 25
    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    cmp-long v3, v1, v3

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    const/4 v3, 0x2

    .line 33
    invoke-static {v3, v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v0, v1

    .line 38
    :cond_2
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->e:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-static {v1}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_3

    .line 45
    .line 46
    const/4 v1, 0x3

    .line 47
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->e:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-static {v1, v2}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/2addr v0, v1

    .line 54
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    add-int/2addr v0, v1

    .line 63
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 64
    .line 65
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
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->getFileName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->m()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    invoke-static {v2, v3}, Lcom/google/protobuf/Internal;->hashLong(J)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    add-int/2addr v1, v0

    .line 47
    mul-int/lit8 v1, v1, 0x25

    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x3

    .line 50
    .line 51
    mul-int/lit8 v1, v1, 0x35

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->n()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    add-int/2addr v1, v0

    .line 62
    mul-int/lit8 v1, v1, 0x1d

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    add-int/2addr v1, v0

    .line 73
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 74
    .line 75
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand;->r()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

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
    iget-byte v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->f:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->f:B

    .line 12
    .line 13
    return v1
.end method

.method public k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->g:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 2
    .line 3
    return-object v0
.end method

.method public m()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public n()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->e:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->e:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->p()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->r(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->p()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object v0

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public p()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->o()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public r(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyCommand$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->v()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->v()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object v0

    return-object v0
.end method

.method public v()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->g:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;-><init>(Lcom/zykj/board/EzyCommand$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;-><init>(Lcom/zykj/board/EzyCommand$a;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->n(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->c:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->c:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-wide v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->d:J

    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    cmp-long v2, v0, v2

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->e:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->e:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method
