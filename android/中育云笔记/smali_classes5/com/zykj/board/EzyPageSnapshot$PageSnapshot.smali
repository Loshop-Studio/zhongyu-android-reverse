# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyPageSnapshot;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PageSnapshot"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;,
        Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    }
.end annotation


# static fields
.field public static final g:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

.field public static final h:Lcom/google/protobuf/Parser;


# instance fields
.field public c:I

.field public d:Lcom/zykj/board/EzyMatrix$Matrix;

.field public e:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

.field public f:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->g:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->h:Lcom/google/protobuf/Parser;

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
    iput-byte v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->f:B

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const/4 p1, -0x1

    .line 3
    iput-byte p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->f:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyPageSnapshot$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic a()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic c(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->d:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic d(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->e:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic e(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->c:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->c:I

    .line 5
    .line 6
    return p1
.end method

.method public static g()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->g:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot;->a()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static o()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->g:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->u()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static t(Ljava/io/InputStream;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->h:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 8
    .line 9
    return-object p0
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
    instance-of v1, p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

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
    check-cast p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->n()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->n()Z

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->n()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->f()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->f()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyMatrix$Matrix;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_3

    .line 47
    .line 48
    return v3

    .line 49
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->hasGraphSnapshot()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->hasGraphSnapshot()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eq v1, v2, :cond_4

    .line 58
    .line 59
    return v3

    .line 60
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->hasGraphSnapshot()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_5

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->m()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->m()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-nez v1, :cond_5

    .line 79
    .line 80
    return v3

    .line 81
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-nez p1, :cond_6

    .line 94
    .line 95
    return v3

    .line 96
    :cond_6
    return v0
.end method

.method public f()Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->d:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->p()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->k()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->k()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    move-result-object v0

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->h:Lcom/google/protobuf/Parser;

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
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->c:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->f()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_0
    iget v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->c:I

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    and-int/2addr v1, v2

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->m()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v0, v1

    .line 38
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v0, v1

    .line 47
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 48
    .line 49
    return v0
.end method

.method public hasGraphSnapshot()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->c:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
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
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->n()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->f()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lcom/zykj/board/EzyMatrix$Matrix;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v1, v0

    .line 38
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->hasGraphSnapshot()Z

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->m()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hashCode()I

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
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot;->b()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

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
    iget-byte v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->f:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->f:B

    .line 12
    .line 13
    return v1
.end method

.method public k()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->g:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 2
    .line 3
    return-object v0
.end method

.method public m()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->e:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->G()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public n()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->c:I

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

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->p()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->r(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->p()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public p()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->o()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public r(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyPageSnapshot$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->u()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->u()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public u()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->g:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;-><init>(Lcom/zykj/board/EzyPageSnapshot$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;-><init>(Lcom/zykj/board/EzyPageSnapshot$a;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->t(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->f()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->c:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    and-int/2addr v0, v1

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->m()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
