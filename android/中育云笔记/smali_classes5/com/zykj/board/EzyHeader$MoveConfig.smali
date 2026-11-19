# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyHeader$MoveConfig;
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
    name = "MoveConfig"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyHeader$MoveConfig$b;
    }
.end annotation


# static fields
.field public static final k:Lcom/zykj/board/EzyHeader$MoveConfig;

.field public static final l:Lcom/google/protobuf/Parser;


# instance fields
.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:I

.field public i:I

.field public j:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyHeader$MoveConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->k:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/board/EzyHeader$MoveConfig$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/board/EzyHeader$MoveConfig$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->l:Lcom/google/protobuf/Parser;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->c:Z

    .line 13
    iput-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->d:Z

    .line 14
    iput-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->e:Z

    .line 15
    iput-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->f:Z

    .line 16
    iput-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->g:Z

    .line 17
    iput v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->h:I

    .line 18
    iput v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->i:I

    const/4 v0, -0x1

    .line 19
    iput-byte v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->j:B

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->c:Z

    .line 4
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->d:Z

    .line 5
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->e:Z

    .line 6
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->f:Z

    .line 7
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->g:Z

    .line 8
    iput p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->h:I

    .line 9
    iput p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->i:I

    const/4 p1, -0x1

    .line 10
    iput-byte p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->j:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyHeader$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/board/EzyHeader$MoveConfig;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->c:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic c(Lcom/zykj/board/EzyHeader$MoveConfig;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->d:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic d(Lcom/zykj/board/EzyHeader$MoveConfig;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->e:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic e(Lcom/zykj/board/EzyHeader$MoveConfig;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->f:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic f(Lcom/zykj/board/EzyHeader$MoveConfig;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->g:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic g(Lcom/zykj/board/EzyHeader$MoveConfig;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->h:I

    .line 2
    .line 3
    return p1
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader;->c()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic k(Lcom/zykj/board/EzyHeader$MoveConfig;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->i:I

    .line 2
    .line 3
    return p1
.end method

.method public static m()Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->k:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public static z()Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->k:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$MoveConfig;->D()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public A()Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$MoveConfig;->z()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public C(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyHeader$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public D()Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->k:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;-><init>(Lcom/zykj/board/EzyHeader$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;-><init>(Lcom/zykj/board/EzyHeader$a;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->n(Lcom/zykj/board/EzyHeader$MoveConfig;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

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
    instance-of v1, p1, Lcom/zykj/board/EzyHeader$MoveConfig;

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
    check-cast p1, Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->p()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->p()Z

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->y()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->y()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eq v1, v2, :cond_3

    .line 37
    .line 38
    return v3

    .line 39
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->o()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->o()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eq v1, v2, :cond_4

    .line 48
    .line 49
    return v3

    .line 50
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->v()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->v()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eq v1, v2, :cond_5

    .line 59
    .line 60
    return v3

    .line 61
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->u()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->u()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eq v1, v2, :cond_6

    .line 70
    .line 71
    return v3

    .line 72
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->r()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->r()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eq v1, v2, :cond_7

    .line 81
    .line 82
    return v3

    .line 83
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->t()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->t()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eq v1, v2, :cond_8

    .line 92
    .line 93
    return v3

    .line 94
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-nez p1, :cond_9

    .line 107
    .line 108
    return v3

    .line 109
    :cond_9
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->n()Lcom/zykj/board/EzyHeader$MoveConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->n()Lcom/zykj/board/EzyHeader$MoveConfig;

    move-result-object v0

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->l:Lcom/google/protobuf/Parser;

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
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->c:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBoolSize(IZ)I

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
    iget-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->d:Z

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeBoolSize(IZ)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    add-int/2addr v0, v1

    .line 28
    :cond_2
    iget-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->e:Z

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    const/4 v2, 0x3

    .line 33
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeBoolSize(IZ)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v0, v1

    .line 38
    :cond_3
    iget-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->f:Z

    .line 39
    .line 40
    if-eqz v1, :cond_4

    .line 41
    .line 42
    const/4 v2, 0x4

    .line 43
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeBoolSize(IZ)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v0, v1

    .line 48
    :cond_4
    iget-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->g:Z

    .line 49
    .line 50
    if-eqz v1, :cond_5

    .line 51
    .line 52
    const/4 v2, 0x5

    .line 53
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeBoolSize(IZ)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    add-int/2addr v0, v1

    .line 58
    :cond_5
    iget v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->h:I

    .line 59
    .line 60
    if-eqz v1, :cond_6

    .line 61
    .line 62
    const/4 v2, 0x6

    .line 63
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    add-int/2addr v0, v1

    .line 68
    :cond_6
    iget v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->i:I

    .line 69
    .line 70
    if-eqz v1, :cond_7

    .line 71
    .line 72
    const/4 v2, 0x7

    .line 73
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/2addr v0, v1

    .line 78
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    add-int/2addr v0, v1

    .line 87
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 88
    .line 89
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
    invoke-static {}, Lcom/zykj/board/EzyHeader$MoveConfig;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->p()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->y()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-static {v0}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->o()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-static {v0}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    add-int/2addr v1, v0

    .line 62
    mul-int/lit8 v1, v1, 0x25

    .line 63
    .line 64
    add-int/lit8 v1, v1, 0x4

    .line 65
    .line 66
    mul-int/lit8 v1, v1, 0x35

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->v()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-static {v0}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    add-int/2addr v1, v0

    .line 77
    mul-int/lit8 v1, v1, 0x25

    .line 78
    .line 79
    add-int/lit8 v1, v1, 0x5

    .line 80
    .line 81
    mul-int/lit8 v1, v1, 0x35

    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->u()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-static {v0}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    add-int/2addr v1, v0

    .line 92
    mul-int/lit8 v1, v1, 0x25

    .line 93
    .line 94
    add-int/lit8 v1, v1, 0x6

    .line 95
    .line 96
    mul-int/lit8 v1, v1, 0x35

    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->r()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    add-int/2addr v1, v0

    .line 103
    mul-int/lit8 v1, v1, 0x25

    .line 104
    .line 105
    add-int/lit8 v1, v1, 0x7

    .line 106
    .line 107
    mul-int/lit8 v1, v1, 0x35

    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->t()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    add-int/2addr v1, v0

    .line 114
    mul-int/lit8 v1, v1, 0x1d

    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    add-int/2addr v1, v0

    .line 125
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 126
    .line 127
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader;->d()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyHeader$MoveConfig$b;

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
    iget-byte v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->j:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->j:B

    .line 12
    .line 13
    return v1
.end method

.method public n()Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$MoveConfig;->k:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->A()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->C(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->A()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public p()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public r()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public t()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->D()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig;->D()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public v()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBool(IZ)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->d:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBool(IZ)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->e:Z

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBool(IZ)V

    .line 23
    .line 24
    .line 25
    :cond_2
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->f:Z

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBool(IZ)V

    .line 31
    .line 32
    .line 33
    :cond_3
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->g:Z

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    const/4 v1, 0x5

    .line 38
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBool(IZ)V

    .line 39
    .line 40
    .line 41
    :cond_4
    iget v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->h:I

    .line 42
    .line 43
    if-eqz v0, :cond_5

    .line 44
    .line 45
    const/4 v1, 0x6

    .line 46
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 47
    .line 48
    .line 49
    :cond_5
    iget v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->i:I

    .line 50
    .line 51
    if-eqz v0, :cond_6

    .line 52
    .line 53
    const/4 v1, 0x7

    .line 54
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 55
    .line 56
    .line 57
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public y()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig;->d:Z

    .line 2
    .line 3
    return v0
.end method
