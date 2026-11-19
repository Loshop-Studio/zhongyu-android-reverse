.class public abstract Lb4/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final c:Lcom/google/protobuf/Descriptors$FileDescriptor;


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
    sput-object v0, Lb4/d0;->c:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 31
    .line 32
    sput-object v0, Lb4/d0;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 33
    .line 34
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 35
    .line 36
    const-string v10, "PerSp1"

    .line 37
    .line 38
    const-string v11, "PerSp2"

    .line 39
    .line 40
    const-string v2, "EventTime"

    .line 41
    .line 42
    const-string v3, "ScaleX"

    .line 43
    .line 44
    const-string v4, "SkewX"

    .line 45
    .line 46
    const-string v5, "TransX"

    .line 47
    .line 48
    const-string v6, "SkewY"

    .line 49
    .line 50
    const-string v7, "ScaleY"

    .line 51
    .line 52
    const-string v8, "TransY"

    .line 53
    .line 54
    const-string v9, "PerSp0"

    .line 55
    .line 56
    filled-new-array/range {v2 .. v11}, [Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    sput-object v1, Lb4/d0;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 64
    .line 65
    invoke-static {}, Lcom/google/protobuf/AnyProto;->getDescriptor()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 66
    .line 67
    .line 68
    return-void
.end method
