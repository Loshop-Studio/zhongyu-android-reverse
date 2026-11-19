# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyTouchEvent$TouchEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PointerProperties"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;
    }
.end annotation


# static fields
.field public static final f:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

.field public static final g:Lcom/google/protobuf/Parser;


# instance fields
.field public c:I

.field public d:I

.field public e:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->f:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->g:Lcom/google/protobuf/Parser;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->c:I

    .line 8
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->d:I

    const/4 v0, -0x1

    .line 9
    iput-byte v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->e:B

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->c:I

    .line 4
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->d:I

    const/4 p1, -0x1

    .line 5
    iput-byte p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->e:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyTouchEvent$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->c:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic c(Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->d:I

    .line 2
    .line 3
    return p1
.end method

.method public static d()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->f:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 2
    .line 3
    return-object v0
.end method

.method public static f()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->f:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->m()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent;->d()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->g:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public e()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->f:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 2
    .line 3
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
    instance-of v1, p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

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
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getId()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getId()I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getToolType()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getToolType()I

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
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_4

    .line 52
    .line 53
    return v3

    .line 54
    :cond_4
    return v0
.end method

.method public g()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->f()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->e()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->e()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    move-result-object v0

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->g:Lcom/google/protobuf/Parser;

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
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->c:I

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
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->d:I

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    add-int/2addr v0, v1

    .line 28
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-int/2addr v0, v1

    .line 37
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 38
    .line 39
    return v0
.end method

.method public getToolType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->d:I

    .line 2
    .line 3
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
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getId()I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getToolType()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    add-int/2addr v1, v0

    .line 39
    mul-int/lit8 v1, v1, 0x1d

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    add-int/2addr v1, v0

    .line 50
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 51
    .line 52
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent;->e()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;

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
    iget-byte v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->e:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->e:B

    .line 12
    .line 13
    return v1
.end method

.method public k(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyTouchEvent$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public m()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->f:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;-><init>(Lcom/zykj/board/EzyTouchEvent$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;-><init>(Lcom/zykj/board/EzyTouchEvent$a;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;->n(Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->g()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->k(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->g()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;

    move-result-object v0

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->m()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->m()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->c:I

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
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->d:I

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
