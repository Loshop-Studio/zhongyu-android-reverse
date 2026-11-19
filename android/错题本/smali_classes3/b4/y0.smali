.class public abstract Lb4/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/protobuf/Descriptors$FileDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "\n\u0018enums/PositionEnum.proto*\u00a0\u0001\n\u000cPositionEnum\u0012\u000c\n\u0008TOP_LEFT\u0010\u0000\u0012\u000e\n\nTOP_CENTER\u0010\u0001\u0012\r\n\tTOP_RIGHT\u0010\u0002\u0012\u000f\n\u000bCENTER_LEFT\u0010\u0003\u0012\n\n\u0006CENTER\u0010\u0004\u0012\u0010\n\u000cCENTER_RIGHT\u0010\u0005\u0012\u000f\n\u000bBOTTOM_LEFT\u0010\u0006\u0012\u0011\n\rBOTTOM_CENTER\u0010\u0007\u0012\u0010\n\u000cBOTTOM_RIGHT\u0010\u0008B!\n\u000ecom.zykj.boardB\u000fEzyPositionEnumb\u0006proto3"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/google/protobuf/Descriptors$FileDescriptor;->internalBuildGeneratedFileFrom([Ljava/lang/String;[Lcom/google/protobuf/Descriptors$FileDescriptor;)Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lb4/y0;->a:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 15
    .line 16
    return-void
.end method
