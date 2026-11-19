# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzySource$TouchSource$TouchInfo;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzySource$TouchSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TouchInfo"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    }
.end annotation


# static fields
.field public static final g:Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

.field public static final h:Lcom/google/protobuf/Parser;


# instance fields
.field public c:I

.field public d:Ljava/util/List;

.field public e:Lcom/zykj/board/EzyPaint$Paint;

.field public f:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->g:Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->h:Lcom/google/protobuf/Parser;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 4
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const/4 v0, -0x1

    .line 5
    iput-byte v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->f:B

    .line 6
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->d:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const/4 p1, -0x1

    .line 3
    iput-byte p1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->f:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzySource$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->c:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->c:I

    .line 5
    .line 6
    return p1
.end method

.method public static synthetic c()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic d()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic e(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic g(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPaint$Paint;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->e:Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    return-object p1
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzySource;->f()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static k()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->g:Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public static p()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->g:Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->u()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->h:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

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
    check-cast p1, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->getTouchEventList()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->getTouchEventList()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

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
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->o()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->o()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eq v1, v3, :cond_3

    .line 41
    .line 42
    return v2

    .line 43
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->o()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->n()Lcom/zykj/board/EzyPaint$Paint;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->n()Lcom/zykj/board/EzyPaint$Paint;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v1, v3}, Lcom/zykj/board/EzyPaint$Paint;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_4

    .line 62
    .line 63
    return v2

    .line 64
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-nez p1, :cond_5

    .line 77
    .line 78
    return v2

    .line 79
    :cond_5
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->m()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->m()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    move-result-object v0

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->h:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

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
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    iget-object v2, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->d:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x1

    .line 16
    if-ge v0, v2, :cond_1

    .line 17
    .line 18
    iget-object v2, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->d:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 25
    .line 26
    invoke-static {v3, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-int/2addr v1, v2

    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->c:I

    .line 35
    .line 36
    and-int/2addr v0, v3

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->n()Lcom/zykj/board/EzyPaint$Paint;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v0, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/2addr v1, v0

    .line 49
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    add-int/2addr v1, v0

    .line 58
    iput v1, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 59
    .line 60
    return v1
.end method

.method public getTouchEventCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->d:Ljava/util/List;

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

.method public getTouchEventList()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

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
    invoke-static {}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->getTouchEventCount()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-lez v0, :cond_1

    .line 22
    .line 23
    mul-int/lit8 v1, v1, 0x25

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    mul-int/lit8 v1, v1, 0x35

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->getTouchEventList()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v1, v0

    .line 38
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->o()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    mul-int/lit8 v1, v1, 0x25

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x2

    .line 47
    .line 48
    mul-int/lit8 v1, v1, 0x35

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->n()Lcom/zykj/board/EzyPaint$Paint;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lcom/zykj/board/EzyPaint$Paint;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    add-int/2addr v1, v0

    .line 59
    :cond_2
    mul-int/lit8 v1, v1, 0x1d

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    add-int/2addr v1, v0

    .line 70
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 71
    .line 72
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzySource;->h()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

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
    iget-byte v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->f:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->f:B

    .line 12
    .line 13
    return v1
.end method

.method public m()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->g:Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()Lcom/zykj/board/EzyPaint$Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->e:Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->k()Lcom/zykj/board/EzyPaint$Paint;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->r()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->t(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->r()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public o()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public r()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->p()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public t(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzySource$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->u()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->u()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public u()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->g:Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;-><init>(Lcom/zykj/board/EzySource$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;-><init>(Lcom/zykj/board/EzySource$a;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->t(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->d:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x1

    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->d:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/google/protobuf/MessageLite;

    .line 18
    .line 19
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->c:I

    .line 26
    .line 27
    and-int/2addr v0, v2

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x2

    .line 31
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->n()Lcom/zykj/board/EzyPaint$Paint;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method
