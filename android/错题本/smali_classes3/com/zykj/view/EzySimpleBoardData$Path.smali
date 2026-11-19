# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/view/EzySimpleBoardData$Path;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/view/EzySimpleBoardData$PathOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/EzySimpleBoardData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Path"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/EzySimpleBoardData$Path$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite<",
        "Lcom/zykj/view/EzySimpleBoardData$Path;",
        "Lcom/zykj/view/EzySimpleBoardData$Path$Builder;",
        ">;",
        "Lcom/zykj/view/EzySimpleBoardData$PathOrBuilder;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

.field public static final PAINT_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/view/EzySimpleBoardData$Path;",
            ">;"
        }
    .end annotation
.end field

.field public static final POINT_FIELD_NUMBER:I = 0x1


# instance fields
.field private bitField0_:I

.field private paint_:Lcom/zykj/view/EzySimpleBoardData$Paint;

.field private point_:Lcom/google/protobuf/Internal$ProtobufList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Internal$ProtobufList<",
            "Lcom/zykj/view/EzySimpleBoardData$PointF;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/view/EzySimpleBoardData$Path;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 7
    .line 8
    const-class v1, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageLite;->registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageLite;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/google/protobuf/GeneratedMessageLite;->emptyProtobufList()Lcom/google/protobuf/Internal$ProtobufList;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->point_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 9
    .line 10
    return-void
.end method

.method public static bridge synthetic a(Lcom/zykj/view/EzySimpleBoardData$Path;Ljava/lang/Iterable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/EzySimpleBoardData$Path;->addAllPoint(Ljava/lang/Iterable;)V

    return-void
.end method

.method private addAllPoint(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/zykj/view/EzySimpleBoardData$PointF;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$Path;->ensurePointIsMutable()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->point_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private addPoint(ILcom/zykj/view/EzySimpleBoardData$PointF;)V
    .locals 1

    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$Path;->ensurePointIsMutable()V

    .line 6
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->point_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method

.method private addPoint(Lcom/zykj/view/EzySimpleBoardData$PointF;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$Path;->ensurePointIsMutable()V

    .line 3
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->point_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static bridge synthetic b(Lcom/zykj/view/EzySimpleBoardData$Path;ILcom/zykj/view/EzySimpleBoardData$PointF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/view/EzySimpleBoardData$Path;->addPoint(ILcom/zykj/view/EzySimpleBoardData$PointF;)V

    return-void
.end method

.method public static bridge synthetic c(Lcom/zykj/view/EzySimpleBoardData$Path;Lcom/zykj/view/EzySimpleBoardData$PointF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/EzySimpleBoardData$Path;->addPoint(Lcom/zykj/view/EzySimpleBoardData$PointF;)V

    return-void
.end method

.method private clearPaint()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->paint_:Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->bitField0_:I

    .line 5
    .line 6
    and-int/lit8 v0, v0, -0x2

    .line 7
    .line 8
    iput v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->bitField0_:I

    .line 9
    .line 10
    return-void
.end method

.method private clearPoint()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/GeneratedMessageLite;->emptyProtobufList()Lcom/google/protobuf/Internal$ProtobufList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->point_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 6
    .line 7
    return-void
.end method

.method public static bridge synthetic d(Lcom/zykj/view/EzySimpleBoardData$Path;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$Path;->clearPaint()V

    return-void
.end method

.method public static bridge synthetic e(Lcom/zykj/view/EzySimpleBoardData$Path;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$Path;->clearPoint()V

    return-void
.end method

.method private ensurePointIsMutable()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->point_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/protobuf/Internal$ProtobufList;->isModifiable()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessageLite;->mutableCopy(Lcom/google/protobuf/Internal$ProtobufList;)Lcom/google/protobuf/Internal$ProtobufList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->point_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public static bridge synthetic f(Lcom/zykj/view/EzySimpleBoardData$Path;Lcom/zykj/view/EzySimpleBoardData$Paint;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/EzySimpleBoardData$Path;->mergePaint(Lcom/zykj/view/EzySimpleBoardData$Paint;)V

    return-void
.end method

.method public static bridge synthetic g(ILcom/zykj/view/EzySimpleBoardData$Path;)V
    .locals 0

    .line 1
    invoke-direct {p1, p0}, Lcom/zykj/view/EzySimpleBoardData$Path;->removePoint(I)V

    return-void
.end method

.method public static getDefaultInstance()Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic h(Lcom/zykj/view/EzySimpleBoardData$Path;Lcom/zykj/view/EzySimpleBoardData$Paint;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/EzySimpleBoardData$Path;->setPaint(Lcom/zykj/view/EzySimpleBoardData$Paint;)V

    return-void
.end method

.method public static bridge synthetic i(Lcom/zykj/view/EzySimpleBoardData$Path;ILcom/zykj/view/EzySimpleBoardData$PointF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/view/EzySimpleBoardData$Path;->setPoint(ILcom/zykj/view/EzySimpleBoardData$PointF;)V

    return-void
.end method

.method public static bridge synthetic j()Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    return-object v0
.end method

.method private mergePaint(Lcom/zykj/view/EzySimpleBoardData$Paint;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->paint_:Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lcom/zykj/view/EzySimpleBoardData$Paint;->getDefaultInstance()Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->paint_:Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/zykj/view/EzySimpleBoardData$Paint;->newBuilder(Lcom/zykj/view/EzySimpleBoardData$Paint;)Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->mergeFrom(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->buildPartial()Lcom/google/protobuf/GeneratedMessageLite;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 31
    .line 32
    iput-object p1, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->paint_:Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iput-object p1, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->paint_:Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 36
    .line 37
    :goto_0
    iget p1, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->bitField0_:I

    .line 38
    .line 39
    or-int/lit8 p1, p1, 0x1

    .line 40
    .line 41
    iput p1, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->bitField0_:I

    .line 42
    .line 43
    return-void
.end method

.method public static newBuilder()Lcom/zykj/view/EzySimpleBoardData$Path$Builder;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path$Builder;

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/view/EzySimpleBoardData$Path;)Lcom/zykj/view/EzySimpleBoardData$Path$Builder;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Path$Builder;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Path;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Path;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Path;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Path;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Path;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Path;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Path;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Path;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Path;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Path;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Path;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Path;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/view/EzySimpleBoardData$Path;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->getParserForType()Lcom/google/protobuf/Parser;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private removePoint(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$Path;->ensurePointIsMutable()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->point_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private setPaint(Lcom/zykj/view/EzySimpleBoardData$Paint;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->paint_:Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->bitField0_:I

    .line 11
    .line 12
    return-void
.end method

.method private setPoint(ILcom/zykj/view/EzySimpleBoardData$PointF;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$Path;->ensurePointIsMutable()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->point_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object p2, Lcom/zykj/view/EzySimpleBoardData$1;->$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, p2, p1

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :pswitch_0
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    :pswitch_1
    const/4 p1, 0x1

    .line 21
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :pswitch_2
    sget-object p1, Lcom/zykj/view/EzySimpleBoardData$Path;->PARSER:Lcom/google/protobuf/Parser;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    const-class p2, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 31
    .line 32
    monitor-enter p2

    .line 33
    :try_start_0
    sget-object p1, Lcom/zykj/view/EzySimpleBoardData$Path;->PARSER:Lcom/google/protobuf/Parser;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    new-instance p1, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    .line 38
    .line 39
    sget-object p3, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 40
    .line 41
    invoke-direct {p1, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 42
    .line 43
    .line 44
    sput-object p1, Lcom/zykj/view/EzySimpleBoardData$Path;->PARSER:Lcom/google/protobuf/Parser;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    monitor-exit p2

    .line 50
    return-object p1

    .line 51
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    throw p1

    .line 53
    :cond_1
    return-object p1

    .line 54
    :pswitch_3
    sget-object p1, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_4
    const-string p1, "bitField0_"

    .line 58
    .line 59
    const-string p2, "point_"

    .line 60
    .line 61
    const-class p3, Lcom/zykj/view/EzySimpleBoardData$PointF;

    .line 62
    .line 63
    const-string v0, "paint_"

    .line 64
    .line 65
    filled-new-array {p1, p2, p3, v0}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string p2, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000"

    .line 70
    .line 71
    sget-object p3, Lcom/zykj/view/EzySimpleBoardData$Path;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 72
    .line 73
    invoke-static {p3, p2, p1}, Lcom/google/protobuf/GeneratedMessageLite;->newMessageInfo(Lcom/google/protobuf/MessageLite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1

    .line 78
    :pswitch_5
    new-instance p1, Lcom/zykj/view/EzySimpleBoardData$Path$Builder;

    .line 79
    .line 80
    const/4 p2, 0x0

    .line 81
    invoke-direct {p1, p2}, Lcom/zykj/view/EzySimpleBoardData$Path$Builder;-><init>(I)V

    .line 82
    .line 83
    .line 84
    return-object p1

    .line 85
    :pswitch_6
    new-instance p1, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 86
    .line 87
    invoke-direct {p1}, Lcom/zykj/view/EzySimpleBoardData$Path;-><init>()V

    .line 88
    .line 89
    .line 90
    return-object p1

    .line 91
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getPaint()Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->paint_:Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/view/EzySimpleBoardData$Paint;->getDefaultInstance()Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getPoint(I)Lcom/zykj/view/EzySimpleBoardData$PointF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->point_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/view/EzySimpleBoardData$PointF;

    .line 8
    .line 9
    return-object p1
.end method

.method public getPointCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->point_:Lcom/google/protobuf/Internal$ProtobufList;

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

.method public getPointList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/view/EzySimpleBoardData$PointF;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->point_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPointOrBuilder(I)Lcom/zykj/view/EzySimpleBoardData$PointFOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->point_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/view/EzySimpleBoardData$PointFOrBuilder;

    .line 8
    .line 9
    return-object p1
.end method

.method public getPointOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/view/EzySimpleBoardData$PointFOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->point_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 2
    .line 3
    return-object v0
.end method

.method public hasPaint()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/EzySimpleBoardData$Path;->bitField0_:I

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
