# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;
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
    name = "PointerCoords"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;
    }
.end annotation


# static fields
.field public static final d:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

.field public static final e:Lcom/google/protobuf/Parser;


# instance fields
.field public a:F

.field public b:F

.field public c:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->d:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->e:Lcom/google/protobuf/Parser;

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
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->a:F

    .line 8
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->b:F

    const/4 v0, -0x1

    .line 9
    iput-byte v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->c:B

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->a:F

    .line 4
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->b:F

    const/4 p1, -0x1

    .line 5
    iput-byte p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->c:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyTouchEvent$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->a:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic c(Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->b:F

    .line 2
    .line 3
    return p1
.end method

.method public static g()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->d:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent;->f()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static n()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->d:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->u()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

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
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->e:Lcom/google/protobuf/Parser;

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
    instance-of v1, p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

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
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/4 v3, 0x0

    .line 33
    if-eq v1, v2, :cond_2

    .line 34
    .line 35
    return v3

    .line 36
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eq v1, v2, :cond_3

    .line 53
    .line 54
    return v3

    .line 55
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_4

    .line 68
    .line 69
    return v3

    .line 70
    :cond_4
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->k()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->k()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    move-result-object v0

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->e:Lcom/google/protobuf/Parser;

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
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->a:F

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->a:F

    .line 17
    .line 18
    invoke-static {v0, v1}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

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
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->b:F

    .line 25
    .line 26
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    const/4 v1, 0x2

    .line 33
    iget v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->b:F

    .line 34
    .line 35
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-int/2addr v0, v1

    .line 40
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/2addr v0, v1

    .line 49
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 50
    .line 51
    return v0
.end method

.method public getX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->a:F

    .line 2
    .line 3
    return v0
.end method

.method public getY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->b:F

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
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getX()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->getY()F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    add-int/2addr v1, v0

    .line 47
    mul-int/lit8 v1, v1, 0x1d

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    add-int/2addr v1, v0

    .line 58
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 59
    .line 60
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent;->c()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

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
    iget-byte v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->c:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->c:B

    .line 12
    .line 13
    return v1
.end method

.method public k()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->d:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->q()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->t(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->q()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

    move-result-object v0

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public q()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->n()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public t(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyTouchEvent$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->u()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->u()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

    move-result-object v0

    return-object v0
.end method

.method public u()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->d:Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;-><init>(Lcom/zykj/board/EzyTouchEvent$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;-><init>(Lcom/zykj/board/EzyTouchEvent$a;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;->o(Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

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
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->a:F

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->b:F

    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->b:F

    .line 25
    .line 26
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
