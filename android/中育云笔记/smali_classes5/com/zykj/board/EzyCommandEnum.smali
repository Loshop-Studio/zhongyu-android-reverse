.class public abstract Lcom/zykj/board/EzyCommandEnum;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyCommandEnum$CommandEnum;
    }
.end annotation


# static fields
.field public static a:Lcom/google/protobuf/Descriptors$FileDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "\n\u0017enums/CommandEnum.proto*\u00b7\u0002\n\u000bCommandEnum\u0012\u0012\n\u000eACTION_DEFAULT\u0010\u0000\u0012\u0014\n\u0010ACTION_GRAPH_ADD\u0010\u0001\u0012\u0017\n\u0013ACTION_GRAPH_REMOVE\u0010\u0002\u0012\u0017\n\u0013ACTION_GRAPH_MATRIX\u0010\u0003\u0012\u0017\n\u0013ACTION_GRAPH_CHANGE\u0010\u0004\u0012\u0017\n\u0013ACTION_GRAPH_CUSTOM\u0010\u0005\u0012\u0016\n\u0012ACTION_AUDIO_START\u0010\u0006\u0012\u0011\n\rACTION_CAMERA\u0010\u0007\u0012\u0018\n\u0014ACTION_CAMERA_MATRIX\u0010\u0008\u0012\u0011\n\rACTION_CONFIG\u0010\t\u0012\u0016\n\u0012ACTION_RECORD_STOP\u0010\n\u0012\u0016\n\u0012ACTION_CURSOR_MOVE\u0010\u000b\u0012\u0012\n\u000eACTION_REBUILD\u0010\u000cB \n\u000ecom.zykj.boardB\u000eEzyCommandEnumb\u0006proto3"

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
    sput-object v0, Lcom/zykj/board/EzyCommandEnum;->a:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 15
    .line 16
    return-void
.end method

.method public static a()Lcom/google/protobuf/Descriptors$FileDescriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyCommandEnum;->a:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    return-object v0
.end method
