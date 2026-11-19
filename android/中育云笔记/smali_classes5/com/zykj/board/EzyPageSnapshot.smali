# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public abstract Lcom/zykj/board/EzyPageSnapshot;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final c:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static e:Lcom/google/protobuf/Descriptors$FileDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    const-string v0, "\n\u0013GraphSnapshot.proto\u001a\u0011utils/RectF.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0012utils/Matrix.proto\u001a\u0015enums/GraphEnum.proto\"\u009a\u0003\n\u000cPageSnapshot\u0012\u001d\n\u000ccameraMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u00122\n\rgraphSnapshot\u0018\u0002 \u0001(\u000b2\u001b.PageSnapshot.GraphSnapshot\u001a\u00b6\u0002\n\rGraphSnapshot\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u001d\n\tgraphEnum\u0018\u0002 \u0001(\u000e2\n.GraphEnum\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u0017\n\u0006matrix\u0018\u0004 \u0001(\u000b2\u0007.Matrix\u0012/\n\nchildGraph\u0018\u0005 \u0003(\u000b2\u001b.PageSnapshot.GraphSnapshot\u0012\u0016\n\u000esourceFileName\u0018\u0006 \u0001(\t\u0012\u0010\n\u0008sourceId\u0018\u0007 \u0001(\u0005\u0012\u0017\n\u000fbackgroundColor\u0018\u0008 \u0001(\u0005\u0012\u0015\n\u0005paint\u0018\t \u0001(\u000b2\u0006.Paint\u0012\u000f\n\u0007content\u0018\n \u0001(\t\u0012\u001a\n\tpointList\u0018\u000b \u0003(\u000b2\u0007.PointF\u0012\u0010\n\u0008filePath\u0018\u000c \u0001(\tB!\n\u000ecom.zykj.boardB\u000fEzyPageSnapshotb\u0006proto3"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Lcom/zykj/board/EzyRectF;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {}, Lcom/zykj/board/EzyPaint;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {}, Lcom/zykj/board/EzyPointF;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {}, Lcom/zykj/board/EzyMatrix;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {}, Lcom/zykj/board/EzyGraphEnum;->a()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    filled-new-array {v1, v2, v3, v4, v5}, [Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, v1}, Lcom/google/protobuf/Descriptors$FileDescriptor;->internalBuildGeneratedFileFrom([Ljava/lang/String;[Lcom/google/protobuf/Descriptors$FileDescriptor;)Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/zykj/board/EzyPageSnapshot;->e:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 36
    .line 37
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot;->e()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 51
    .line 52
    sput-object v0, Lcom/zykj/board/EzyPageSnapshot;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 53
    .line 54
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 55
    .line 56
    const-string v3, "CameraMatrix"

    .line 57
    .line 58
    const-string v4, "GraphSnapshot"

    .line 59
    .line 60
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    sput-object v2, Lcom/zykj/board/EzyPageSnapshot;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 78
    .line 79
    sput-object v0, Lcom/zykj/board/EzyPageSnapshot;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 80
    .line 81
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 82
    .line 83
    const-string v12, "PointList"

    .line 84
    .line 85
    const-string v13, "FilePath"

    .line 86
    .line 87
    const-string v2, "Id"

    .line 88
    .line 89
    const-string v3, "GraphEnum"

    .line 90
    .line 91
    const-string v4, "OutRect"

    .line 92
    .line 93
    const-string v5, "Matrix"

    .line 94
    .line 95
    const-string v6, "ChildGraph"

    .line 96
    .line 97
    const-string v7, "SourceFileName"

    .line 98
    .line 99
    const-string v8, "SourceId"

    .line 100
    .line 101
    const-string v9, "BackgroundColor"

    .line 102
    .line 103
    const-string v10, "Paint"

    .line 104
    .line 105
    const-string v11, "Content"

    .line 106
    .line 107
    filled-new-array/range {v2 .. v13}, [Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    sput-object v1, Lcom/zykj/board/EzyPageSnapshot;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 115
    .line 116
    invoke-static {}, Lcom/zykj/board/EzyRectF;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 117
    .line 118
    .line 119
    invoke-static {}, Lcom/zykj/board/EzyPaint;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 120
    .line 121
    .line 122
    invoke-static {}, Lcom/zykj/board/EzyPointF;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 123
    .line 124
    .line 125
    invoke-static {}, Lcom/zykj/board/EzyMatrix;->c()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 126
    .line 127
    .line 128
    invoke-static {}, Lcom/zykj/board/EzyGraphEnum;->a()Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public static synthetic a()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic c()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic d()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    return-object v0
.end method

.method public static e()Lcom/google/protobuf/Descriptors$FileDescriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot;->e:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    return-object v0
.end method
