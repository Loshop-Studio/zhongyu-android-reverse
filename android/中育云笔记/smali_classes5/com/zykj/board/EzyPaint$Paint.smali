# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyPaint$Paint;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyPaint;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Paint"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyPaint$Paint$b;
    }
.end annotation


# static fields
.field public static final j:Lcom/zykj/board/EzyPaint$Paint;

.field public static final k:Lcom/google/protobuf/Parser;


# instance fields
.field public c:F

.field public d:I

.field public e:F

.field public f:F

.field public g:I

.field public h:F

.field public i:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyPaint$Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyPaint$Paint;->j:Lcom/zykj/board/EzyPaint$Paint;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/board/EzyPaint$Paint$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/board/EzyPaint$Paint$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyPaint$Paint;->k:Lcom/google/protobuf/Parser;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 10
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const/4 v0, 0x0

    .line 11
    iput v0, p0, Lcom/zykj/board/EzyPaint$Paint;->c:F

    const/4 v1, 0x0

    .line 12
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint;->d:I

    .line 13
    iput v0, p0, Lcom/zykj/board/EzyPaint$Paint;->e:F

    .line 14
    iput v0, p0, Lcom/zykj/board/EzyPaint$Paint;->f:F

    .line 15
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint;->g:I

    .line 16
    iput v0, p0, Lcom/zykj/board/EzyPaint$Paint;->h:F

    const/4 v0, -0x1

    .line 17
    iput-byte v0, p0, Lcom/zykj/board/EzyPaint$Paint;->i:B

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 1

    .line 2
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint;->c:F

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/zykj/board/EzyPaint$Paint;->d:I

    .line 5
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint;->e:F

    .line 6
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint;->f:F

    .line 7
    iput v0, p0, Lcom/zykj/board/EzyPaint$Paint;->g:I

    .line 8
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint;->h:F

    const/4 p1, -0x1

    .line 9
    iput-byte p1, p0, Lcom/zykj/board/EzyPaint$Paint;->i:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyPaint$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyPaint$Paint;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/board/EzyPaint$Paint;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint;->h:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic c(Lcom/zykj/board/EzyPaint$Paint;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint;->c:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic d(Lcom/zykj/board/EzyPaint$Paint;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint;->d:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic e(Lcom/zykj/board/EzyPaint$Paint;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint;->e:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic f(Lcom/zykj/board/EzyPaint$Paint;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint;->f:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic g(Lcom/zykj/board/EzyPaint$Paint;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint;->g:I

    .line 2
    .line 3
    return p1
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPaint;->a()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static k()Lcom/zykj/board/EzyPaint$Paint;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPaint$Paint;->j:Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public static t()Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPaint$Paint;->j:Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/board/EzyPaint$Paint;->y()Lcom/zykj/board/EzyPaint$Paint$b;

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
    instance-of v1, p1, Lcom/zykj/board/EzyPaint$Paint;

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
    check-cast p1, Lcom/zykj/board/EzyPaint$Paint;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->getWidth()F

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->getWidth()F

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->getColor()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->getColor()I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->o()F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->o()F

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eq v1, v2, :cond_4

    .line 64
    .line 65
    return v3

    .line 66
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->n()F

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->n()F

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eq v1, v2, :cond_5

    .line 83
    .line 84
    return v3

    .line 85
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->p()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->p()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eq v1, v2, :cond_6

    .line 94
    .line 95
    return v3

    .line 96
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->r()F

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->r()F

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eq v1, v2, :cond_7

    .line 113
    .line 114
    return v3

    .line 115
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-nez p1, :cond_8

    .line 128
    .line 129
    return v3

    .line 130
    :cond_8
    return v0
.end method

.method public getColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPaint$Paint;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->m()Lcom/zykj/board/EzyPaint$Paint;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->m()Lcom/zykj/board/EzyPaint$Paint;

    move-result-object v0

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPaint$Paint;->k:Lcom/google/protobuf/Parser;

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
    iget v0, p0, Lcom/zykj/board/EzyPaint$Paint;->c:F

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
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint;->c:F

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
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint;->d:I

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_2
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint;->e:F

    .line 35
    .line 36
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    const/4 v1, 0x3

    .line 43
    iget v2, p0, Lcom/zykj/board/EzyPaint$Paint;->e:F

    .line 44
    .line 45
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    add-int/2addr v0, v1

    .line 50
    :cond_3
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint;->f:F

    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    const/4 v1, 0x4

    .line 59
    iget v2, p0, Lcom/zykj/board/EzyPaint$Paint;->f:F

    .line 60
    .line 61
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    add-int/2addr v0, v1

    .line 66
    :cond_4
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint;->g:I

    .line 67
    .line 68
    if-eqz v1, :cond_5

    .line 69
    .line 70
    const/4 v2, 0x5

    .line 71
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    add-int/2addr v0, v1

    .line 76
    :cond_5
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint;->h:F

    .line 77
    .line 78
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_6

    .line 83
    .line 84
    const/4 v1, 0x6

    .line 85
    iget v2, p0, Lcom/zykj/board/EzyPaint$Paint;->h:F

    .line 86
    .line 87
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    add-int/2addr v0, v1

    .line 92
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    add-int/2addr v0, v1

    .line 101
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 102
    .line 103
    return v0
.end method

.method public getWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPaint$Paint;->c:F

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
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->getWidth()F

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->getColor()I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->o()F

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->n()F

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->p()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    add-int/2addr v1, v0

    .line 84
    mul-int/lit8 v1, v1, 0x25

    .line 85
    .line 86
    add-int/lit8 v1, v1, 0x6

    .line 87
    .line 88
    mul-int/lit8 v1, v1, 0x35

    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->r()F

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    add-int/2addr v1, v0

    .line 99
    mul-int/lit8 v1, v1, 0x1d

    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    add-int/2addr v1, v0

    .line 110
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 111
    .line 112
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPaint;->b()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyPaint$Paint;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyPaint$Paint$b;

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
    iget-byte v0, p0, Lcom/zykj/board/EzyPaint$Paint;->i:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzyPaint$Paint;->i:B

    .line 12
    .line 13
    return v1
.end method

.method public m()Lcom/zykj/board/EzyPaint$Paint;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPaint$Paint;->j:Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPaint$Paint;->f:F

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->u()Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPaint$Paint;->v(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->u()Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object v0

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyPaint$Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public o()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPaint$Paint;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public p()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPaint$Paint;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public r()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPaint$Paint;->h:F

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->y()Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->y()Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object v0

    return-object v0
.end method

.method public u()Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->t()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public v(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyPaint$Paint$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lcom/zykj/board/EzyPaint$Paint$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyPaint$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPaint$Paint;->c:F

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
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint;->c:F

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lcom/zykj/board/EzyPaint$Paint;->d:I

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget v0, p0, Lcom/zykj/board/EzyPaint$Paint;->e:F

    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const/4 v0, 0x3

    .line 32
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint;->e:F

    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 35
    .line 36
    .line 37
    :cond_2
    iget v0, p0, Lcom/zykj/board/EzyPaint$Paint;->f:F

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    const/4 v0, 0x4

    .line 46
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint;->f:F

    .line 47
    .line 48
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 49
    .line 50
    .line 51
    :cond_3
    iget v0, p0, Lcom/zykj/board/EzyPaint$Paint;->g:I

    .line 52
    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    const/4 v1, 0x5

    .line 56
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 57
    .line 58
    .line 59
    :cond_4
    iget v0, p0, Lcom/zykj/board/EzyPaint$Paint;->h:F

    .line 60
    .line 61
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_5

    .line 66
    .line 67
    const/4 v0, 0x6

    .line 68
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint;->h:F

    .line 69
    .line 70
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public y()Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPaint$Paint;->j:Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/zykj/board/EzyPaint$Paint$b;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyPaint$Paint$b;-><init>(Lcom/zykj/board/EzyPaint$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcom/zykj/board/EzyPaint$Paint$b;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyPaint$Paint$b;-><init>(Lcom/zykj/board/EzyPaint$a;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyPaint$Paint$b;->n(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method
