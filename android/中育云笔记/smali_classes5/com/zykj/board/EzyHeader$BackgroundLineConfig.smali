# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyHeader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BackgroundLineConfig"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;
    }
.end annotation


# static fields
.field public static final h:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

.field public static final i:Lcom/google/protobuf/Parser;


# instance fields
.field public c:I

.field public d:F

.field public e:I

.field public f:F

.field public g:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->h:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->i:Lcom/google/protobuf/Parser;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 8
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->c:I

    const/4 v1, 0x0

    .line 10
    iput v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->d:F

    .line 11
    iput v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->f:F

    const/4 v1, -0x1

    .line 12
    iput-byte v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->g:B

    .line 13
    iput v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->e:I

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 1

    .line 2
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->c:I

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->d:F

    .line 5
    iput p1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->e:I

    .line 6
    iput v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->f:F

    const/4 p1, -0x1

    .line 7
    iput-byte p1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->g:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyHeader$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->c:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic c(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->d:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic d(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->e:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic f(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->f:F

    .line 2
    .line 3
    return p1
.end method

.method public static g()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->h:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader;->e()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static t()Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->h:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->y()Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
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
    instance-of v1, p1, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

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
    check-cast p1, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->m()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->m()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eq v1, v2, :cond_2

    .line 26
    .line 27
    return v3

    .line 28
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->n()F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->n()F

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eq v1, v2, :cond_3

    .line 45
    .line 46
    return v3

    .line 47
    :cond_3
    iget v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->e:I

    .line 48
    .line 49
    iget v2, p1, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->e:I

    .line 50
    .line 51
    if-eq v1, v2, :cond_4

    .line 52
    .line 53
    return v3

    .line 54
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->r()F

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->r()F

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eq v1, v2, :cond_5

    .line 71
    .line 72
    return v3

    .line 73
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_6

    .line 86
    .line 87
    return v3

    .line 88
    :cond_6
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->k()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->k()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    move-result-object v0

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->i:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSerializedSize()I
    .locals 3

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
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->c:I

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    :goto_0
    iget v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->d:F

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    iget v2, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->d:F

    .line 28
    .line 29
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_2
    iget v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->e:I

    .line 35
    .line 36
    sget-object v2, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->d:Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->getNumber()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eq v1, v2, :cond_3

    .line 43
    .line 44
    const/4 v1, 0x3

    .line 45
    iget v2, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->e:I

    .line 46
    .line 47
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v0, v1

    .line 52
    :cond_3
    iget v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->f:F

    .line 53
    .line 54
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    const/4 v1, 0x4

    .line 61
    iget v2, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->f:F

    .line 62
    .line 63
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    add-int/2addr v0, v1

    .line 68
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    add-int/2addr v0, v1

    .line 77
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 78
    .line 79
    return v0
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
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->m()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    add-int/2addr v1, v0

    .line 28
    mul-int/lit8 v1, v1, 0x25

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x2

    .line 31
    .line 32
    mul-int/lit8 v1, v1, 0x35

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->n()F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

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
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->e:I

    .line 50
    .line 51
    add-int/2addr v1, v0

    .line 52
    mul-int/lit8 v1, v1, 0x25

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x4

    .line 55
    .line 56
    mul-int/lit8 v1, v1, 0x35

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->r()F

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    add-int/2addr v1, v0

    .line 67
    mul-int/lit8 v1, v1, 0x1d

    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    add-int/2addr v1, v0

    .line 78
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 79
    .line 80
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader;->f()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

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
    iget-byte v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->g:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->g:B

    .line 12
    .line 13
    return v1
.end method

.method public k()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->h:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public n()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->d:F

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->u()Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->v(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->u()Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public o()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->e:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->a(I)Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->f:Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public p()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public r()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->f:F

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->y()Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->y()Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public u()Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->t()Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public v(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyHeader$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->c:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->d:F

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    iget v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->d:F

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->e:I

    .line 24
    .line 25
    sget-object v1, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->d:Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->getNumber()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eq v0, v1, :cond_2

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    iget v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->e:I

    .line 35
    .line 36
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 37
    .line 38
    .line 39
    :cond_2
    iget v0, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->f:F

    .line 40
    .line 41
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    const/4 v0, 0x4

    .line 48
    iget v1, p0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->f:F

    .line 49
    .line 50
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 51
    .line 52
    .line 53
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public y()Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->h:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;-><init>(Lcom/zykj/board/EzyHeader$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;-><init>(Lcom/zykj/board/EzyHeader$a;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;->n(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method
