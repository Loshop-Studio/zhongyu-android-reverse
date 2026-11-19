# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/view/EzySimpleBoardData$SimpleBoardDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/EzySimpleBoardData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SimpleBoardData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite<",
        "Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;",
        "Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;",
        ">;",
        "Lcom/zykj/view/EzySimpleBoardData$SimpleBoardDataOrBuilder;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

.field private static volatile PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;",
            ">;"
        }
    .end annotation
.end field

.field public static final PATH_FIELD_NUMBER:I = 0x1


# instance fields
.field private path_:Lcom/google/protobuf/Internal$ProtobufList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Internal$ProtobufList<",
            "Lcom/zykj/view/EzySimpleBoardData$Path;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    .line 7
    .line 8
    const-class v1, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

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
    iput-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->path_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 9
    .line 10
    return-void
.end method

.method public static bridge synthetic a(Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;Ljava/lang/Iterable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->addAllPath(Ljava/lang/Iterable;)V

    return-void
.end method

.method private addAllPath(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/zykj/view/EzySimpleBoardData$Path;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->ensurePathIsMutable()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->path_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private addPath(ILcom/zykj/view/EzySimpleBoardData$Path;)V
    .locals 1

    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->ensurePathIsMutable()V

    .line 6
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->path_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method

.method private addPath(Lcom/zykj/view/EzySimpleBoardData$Path;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->ensurePathIsMutable()V

    .line 3
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->path_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static bridge synthetic b(Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;ILcom/zykj/view/EzySimpleBoardData$Path;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->addPath(ILcom/zykj/view/EzySimpleBoardData$Path;)V

    return-void
.end method

.method public static bridge synthetic c(Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;Lcom/zykj/view/EzySimpleBoardData$Path;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->addPath(Lcom/zykj/view/EzySimpleBoardData$Path;)V

    return-void
.end method

.method private clearPath()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/GeneratedMessageLite;->emptyProtobufList()Lcom/google/protobuf/Internal$ProtobufList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->path_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 6
    .line 7
    return-void
.end method

.method public static bridge synthetic d(Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->clearPath()V

    return-void
.end method

.method public static bridge synthetic e(Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->removePath(I)V

    return-void
.end method

.method private ensurePathIsMutable()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->path_:Lcom/google/protobuf/Internal$ProtobufList;

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
    iput-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->path_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public static bridge synthetic f(Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;ILcom/zykj/view/EzySimpleBoardData$Path;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->setPath(ILcom/zykj/view/EzySimpleBoardData$Path;)V

    return-void
.end method

.method public static bridge synthetic g()Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    return-object v0
.end method

.method public static getDefaultInstance()Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newBuilder()Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

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

.method private removePath(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->ensurePathIsMutable()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->path_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private setPath(ILcom/zykj/view/EzySimpleBoardData$Path;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->ensurePathIsMutable()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->path_:Lcom/google/protobuf/Internal$ProtobufList;

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
    .locals 0

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
    sget-object p1, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->PARSER:Lcom/google/protobuf/Parser;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    const-class p2, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    .line 31
    .line 32
    monitor-enter p2

    .line 33
    :try_start_0
    sget-object p1, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->PARSER:Lcom/google/protobuf/Parser;

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    new-instance p1, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    .line 38
    .line 39
    sget-object p3, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    .line 40
    .line 41
    invoke-direct {p1, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 42
    .line 43
    .line 44
    sput-object p1, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->PARSER:Lcom/google/protobuf/Parser;

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
    sget-object p1, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_4
    const-string p1, "path_"

    .line 58
    .line 59
    const-class p2, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 60
    .line 61
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const-string p2, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"

    .line 66
    .line 67
    sget-object p3, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->DEFAULT_INSTANCE:Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    .line 68
    .line 69
    invoke-static {p3, p2, p1}, Lcom/google/protobuf/GeneratedMessageLite;->newMessageInfo(Lcom/google/protobuf/MessageLite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :pswitch_5
    new-instance p1, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;

    .line 75
    .line 76
    const/4 p2, 0x0

    .line 77
    invoke-direct {p1, p2}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;-><init>(I)V

    .line 78
    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_6
    new-instance p1, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    .line 82
    .line 83
    invoke-direct {p1}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;-><init>()V

    .line 84
    .line 85
    .line 86
    return-object p1

    .line 87
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

.method public getPath(I)Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->path_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 8
    .line 9
    return-object p1
.end method

.method public getPathCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->path_:Lcom/google/protobuf/Internal$ProtobufList;

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

.method public getPathList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/view/EzySimpleBoardData$Path;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->path_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPathOrBuilder(I)Lcom/zykj/view/EzySimpleBoardData$PathOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->path_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/view/EzySimpleBoardData$PathOrBuilder;

    .line 8
    .line 9
    return-object p1
.end method

.method public getPathOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/view/EzySimpleBoardData$PathOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->path_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 2
    .line 3
    return-object v0
.end method
