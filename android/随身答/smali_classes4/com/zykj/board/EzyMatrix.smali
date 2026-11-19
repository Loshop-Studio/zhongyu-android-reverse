# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public abstract Lcom/zykj/board/EzyMatrix;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyMatrix$Matrix;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static c:Lcom/google/protobuf/Descriptors$FileDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const-string v0, "\n\u0012utils/Matrix.proto\u001a\u0019google/protobuf/any.proto\"\u00a9\u0001\n\u0006Matrix\u0012\u0011\n\teventTime\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006scaleX\u0018\u0002 \u0001(\u0002\u0012\r\n\u0005skewX\u0018\u0003 \u0001(\u0002\u0012\u000e\n\u0006transX\u0018\u0004 \u0001(\u0002\u0012\r\n\u0005skewY\u0018\u0005 \u0001(\u0002\u0012\u000e\n\u0006scaleY\u0018\u0006 \u0001(\u0002\u0012\u000e\n\u0006transY\u0018\u0007 \u0001(\u0002\u0012\u000e\n\u0006perSp0\u0018\u0008 \u0001(\u0002\u0012\u000e\n\u0006perSp1\u0018\t \u0001(\u0002\u0012\u000e\n\u0006perSp2\u0018\n \u0001(\u0002B\u001b\n\u000ecom.zykj.boardB\tEzyMatrixb\u0006proto3"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Lcom/google/protobuf/AnyProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    filled-new-array {v1}, [Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0, v1}, Lcom/google/protobuf/Descriptors$FileDescriptor;->internalBuildGeneratedFileFrom([Ljava/lang/String;[Lcom/google/protobuf/Descriptors$FileDescriptor;)Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/zykj/board/EzyMatrix;->c:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 20
    .line 21
    invoke-static {}, Lcom/zykj/board/EzyMatrix;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 35
    .line 36
    sput-object v0, Lcom/zykj/board/EzyMatrix;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 37
    .line 38
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 39
    .line 40
    const-string v10, "PerSp1"

    .line 41
    .line 42
    const-string v11, "PerSp2"

    .line 43
    .line 44
    const-string v2, "EventTime"

    .line 45
    .line 46
    const-string v3, "ScaleX"

    .line 47
    .line 48
    const-string v4, "SkewX"

    .line 49
    .line 50
    const-string v5, "TransX"

    .line 51
    .line 52
    const-string v6, "SkewY"

    .line 53
    .line 54
    const-string v7, "ScaleY"

    .line 55
    .line 56
    const-string v8, "TransY"

    .line 57
    .line 58
    const-string v9, "PerSp0"

    .line 59
    .line 60
    filled-new-array/range {v2 .. v11}, [Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    sput-object v1, Lcom/zykj/board/EzyMatrix;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 68
    .line 69
    invoke-static {}, Lcom/google/protobuf/AnyProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public static synthetic a()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyMatrix;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyMatrix;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static c()Lcom/google/protobuf/Descriptors$FileDescriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyMatrix;->c:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    return-object v0
.end method
