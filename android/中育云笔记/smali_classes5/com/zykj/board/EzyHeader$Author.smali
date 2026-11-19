# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyHeader$Author;
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
    name = "Author"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyHeader$Author$b;
    }
.end annotation


# static fields
.field public static final j:Lcom/zykj/board/EzyHeader$Author;

.field public static final k:Lcom/google/protobuf/Parser;


# instance fields
.field public volatile c:Ljava/lang/Object;

.field public volatile d:Ljava/lang/Object;

.field public volatile e:Ljava/lang/Object;

.field public volatile f:Ljava/lang/Object;

.field public g:J

.field public h:J

.field public i:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyHeader$Author;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyHeader$Author;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyHeader$Author;->j:Lcom/zykj/board/EzyHeader$Author;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/board/EzyHeader$Author$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/board/EzyHeader$Author$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyHeader$Author;->k:Lcom/google/protobuf/Parser;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 10
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    .line 11
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->c:Ljava/lang/Object;

    .line 12
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->d:Ljava/lang/Object;

    .line 13
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->e:Ljava/lang/Object;

    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->f:Ljava/lang/Object;

    const-wide/16 v1, 0x0

    .line 15
    iput-wide v1, p0, Lcom/zykj/board/EzyHeader$Author;->g:J

    .line 16
    iput-wide v1, p0, Lcom/zykj/board/EzyHeader$Author;->h:J

    const/4 v1, -0x1

    .line 17
    iput-byte v1, p0, Lcom/zykj/board/EzyHeader$Author;->i:B

    .line 18
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->c:Ljava/lang/Object;

    .line 19
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->d:Ljava/lang/Object;

    .line 20
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->e:Ljava/lang/Object;

    .line 21
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 2

    .line 2
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    .line 3
    const-string p1, ""

    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Author;->c:Ljava/lang/Object;

    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Author;->d:Ljava/lang/Object;

    .line 5
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Author;->e:Ljava/lang/Object;

    .line 6
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Author;->f:Ljava/lang/Object;

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p0, Lcom/zykj/board/EzyHeader$Author;->g:J

    .line 8
    iput-wide v0, p0, Lcom/zykj/board/EzyHeader$Author;->h:J

    const/4 p1, -0x1

    .line 9
    iput-byte p1, p0, Lcom/zykj/board/EzyHeader$Author;->i:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyHeader$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyHeader$Author;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static A()Lcom/zykj/board/EzyHeader$Author$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$Author;->j:Lcom/zykj/board/EzyHeader$Author;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$Author;->E()Lcom/zykj/board/EzyHeader$Author$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static synthetic a(Lcom/zykj/board/EzyHeader$Author;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyHeader$Author;->c:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/board/EzyHeader$Author;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Author;->c:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic d(Lcom/zykj/board/EzyHeader$Author;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyHeader$Author;->d:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/board/EzyHeader$Author;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Author;->d:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic f(Lcom/zykj/board/EzyHeader$Author;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyHeader$Author;->e:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/board/EzyHeader$Author;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Author;->e:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader;->g()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic k(Lcom/zykj/board/EzyHeader$Author;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyHeader$Author;->f:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/board/EzyHeader$Author;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Author;->f:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic n(Lcom/zykj/board/EzyHeader$Author;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyHeader$Author;->g:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic o(Lcom/zykj/board/EzyHeader$Author;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyHeader$Author;->h:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$Author;->k:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public static t()Lcom/zykj/board/EzyHeader$Author;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$Author;->j:Lcom/zykj/board/EzyHeader$Author;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public C()Lcom/zykj/board/EzyHeader$Author$b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$Author;->A()Lcom/zykj/board/EzyHeader$Author$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public D(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyHeader$Author$b;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyHeader$Author$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lcom/zykj/board/EzyHeader$Author$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyHeader$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public E()Lcom/zykj/board/EzyHeader$Author$b;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$Author;->j:Lcom/zykj/board/EzyHeader$Author;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/zykj/board/EzyHeader$Author$b;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyHeader$Author$b;-><init>(Lcom/zykj/board/EzyHeader$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcom/zykj/board/EzyHeader$Author$b;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyHeader$Author$b;-><init>(Lcom/zykj/board/EzyHeader$a;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyHeader$Author$b;->n(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/board/EzyHeader$Author$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

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
    instance-of v1, p1, Lcom/zykj/board/EzyHeader$Author;

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
    check-cast p1, Lcom/zykj/board/EzyHeader$Author;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->r()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->r()Ljava/lang/String;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->y()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->y()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_3

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->p()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->p()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_4

    .line 60
    .line 61
    return v2

    .line 62
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->z()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->z()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_5

    .line 75
    .line 76
    return v2

    .line 77
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->getStartTime()J

    .line 78
    .line 79
    .line 80
    move-result-wide v3

    .line 81
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->getStartTime()J

    .line 82
    .line 83
    .line 84
    move-result-wide v5

    .line 85
    cmp-long v1, v3, v5

    .line 86
    .line 87
    if-eqz v1, :cond_6

    .line 88
    .line 89
    return v2

    .line 90
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->v()J

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->v()J

    .line 95
    .line 96
    .line 97
    move-result-wide v5

    .line 98
    cmp-long v1, v3, v5

    .line 99
    .line 100
    if-eqz v1, :cond_7

    .line 101
    .line 102
    return v2

    .line 103
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-nez p1, :cond_8

    .line 116
    .line 117
    return v2

    .line 118
    :cond_8
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->u()Lcom/zykj/board/EzyHeader$Author;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->u()Lcom/zykj/board/EzyHeader$Author;

    move-result-object v0

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$Author;->k:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSerializedSize()I
    .locals 6

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
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->c:Ljava/lang/Object;

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
    iget-object v1, p0, Lcom/zykj/board/EzyHeader$Author;->c:Ljava/lang/Object;

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
    iget-object v1, p0, Lcom/zykj/board/EzyHeader$Author;->d:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-static {v1}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    const/4 v1, 0x2

    .line 33
    iget-object v2, p0, Lcom/zykj/board/EzyHeader$Author;->d:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {v1, v2}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-int/2addr v0, v1

    .line 40
    :cond_2
    iget-object v1, p0, Lcom/zykj/board/EzyHeader$Author;->e:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-static {v1}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_3

    .line 47
    .line 48
    const/4 v1, 0x3

    .line 49
    iget-object v2, p0, Lcom/zykj/board/EzyHeader$Author;->e:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-static {v1, v2}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    add-int/2addr v0, v1

    .line 56
    :cond_3
    iget-object v1, p0, Lcom/zykj/board/EzyHeader$Author;->f:Ljava/lang/Object;

    .line 57
    .line 58
    invoke-static {v1}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_4

    .line 63
    .line 64
    const/4 v1, 0x4

    .line 65
    iget-object v2, p0, Lcom/zykj/board/EzyHeader$Author;->f:Ljava/lang/Object;

    .line 66
    .line 67
    invoke-static {v1, v2}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    add-int/2addr v0, v1

    .line 72
    :cond_4
    iget-wide v1, p0, Lcom/zykj/board/EzyHeader$Author;->g:J

    .line 73
    .line 74
    const-wide/16 v3, 0x0

    .line 75
    .line 76
    cmp-long v5, v1, v3

    .line 77
    .line 78
    if-eqz v5, :cond_5

    .line 79
    .line 80
    const/4 v5, 0x5

    .line 81
    invoke-static {v5, v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    add-int/2addr v0, v1

    .line 86
    :cond_5
    iget-wide v1, p0, Lcom/zykj/board/EzyHeader$Author;->h:J

    .line 87
    .line 88
    cmp-long v3, v1, v3

    .line 89
    .line 90
    if-eqz v3, :cond_6

    .line 91
    .line 92
    const/4 v3, 0x6

    .line 93
    invoke-static {v3, v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeInt64Size(IJ)I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    add-int/2addr v0, v1

    .line 98
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    add-int/2addr v0, v1

    .line 107
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 108
    .line 109
    return v0
.end method

.method public getStartTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/board/EzyHeader$Author;->g:J

    .line 2
    .line 3
    return-wide v0
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
    invoke-static {}, Lcom/zykj/board/EzyHeader$Author;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->r()Ljava/lang/String;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->y()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->p()Ljava/lang/String;

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
    mul-int/lit8 v1, v1, 0x25

    .line 63
    .line 64
    add-int/lit8 v1, v1, 0x4

    .line 65
    .line 66
    mul-int/lit8 v1, v1, 0x35

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->z()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->getStartTime()J

    .line 84
    .line 85
    .line 86
    move-result-wide v2

    .line 87
    invoke-static {v2, v3}, Lcom/google/protobuf/Internal;->hashLong(J)I

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->v()J

    .line 99
    .line 100
    .line 101
    move-result-wide v2

    .line 102
    invoke-static {v2, v3}, Lcom/google/protobuf/Internal;->hashLong(J)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    add-int/2addr v1, v0

    .line 107
    mul-int/lit8 v1, v1, 0x1d

    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    add-int/2addr v1, v0

    .line 118
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 119
    .line 120
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader;->h()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyHeader$Author;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyHeader$Author$b;

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
    iget-byte v0, p0, Lcom/zykj/board/EzyHeader$Author;->i:B

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
    iput-byte v1, p0, Lcom/zykj/board/EzyHeader$Author;->i:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->C()Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Author;->D(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->C()Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object v0

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyHeader$Author;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyHeader$Author;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public p()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->e:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->e:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->c:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->c:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->E()Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author;->E()Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object v0

    return-object v0
.end method

.method public u()Lcom/zykj/board/EzyHeader$Author;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyHeader$Author;->j:Lcom/zykj/board/EzyHeader$Author;

    .line 2
    .line 3
    return-object v0
.end method

.method public v()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/board/EzyHeader$Author;->h:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->c:Ljava/lang/Object;

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
    iget-object v1, p0, Lcom/zykj/board/EzyHeader$Author;->c:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->d:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    iget-object v1, p0, Lcom/zykj/board/EzyHeader$Author;->d:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->e:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    iget-object v1, p0, Lcom/zykj/board/EzyHeader$Author;->e:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->f:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessage;->isStringEmpty(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    const/4 v0, 0x4

    .line 52
    iget-object v1, p0, Lcom/zykj/board/EzyHeader$Author;->f:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-wide v0, p0, Lcom/zykj/board/EzyHeader$Author;->g:J

    .line 58
    .line 59
    const-wide/16 v2, 0x0

    .line 60
    .line 61
    cmp-long v4, v0, v2

    .line 62
    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    const/4 v4, 0x5

    .line 66
    invoke-virtual {p1, v4, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 67
    .line 68
    .line 69
    :cond_4
    iget-wide v0, p0, Lcom/zykj/board/EzyHeader$Author;->h:J

    .line 70
    .line 71
    cmp-long v2, v0, v2

    .line 72
    .line 73
    if-eqz v2, :cond_5

    .line 74
    .line 75
    const/4 v2, 0x6

    .line 76
    invoke-virtual {p1, v2, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeInt64(IJ)V

    .line 77
    .line 78
    .line 79
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public y()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->d:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->d:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public z()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->f:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author;->f:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method
