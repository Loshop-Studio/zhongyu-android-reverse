.class public abstract Lcom/zykj/board/EzyModeEnum;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyModeEnum$ModeEnum;
    }
.end annotation


# static fields
.field public static a:Lcom/google/protobuf/Descriptors$FileDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "\n\u0014enums/ModeEnum.proto*\u00f4\u0001\n\u0008ModeEnum\u0012\u0011\n\rACTION_SELECT\u0010\u0000\u0012\u0012\n\u000eACTION_WRITING\u0010\u0001\u0012\u0017\n\u0013ACTION_WRITING_MOVE\u0010\u0002\u0012\u001a\n\u0016ACTION_WRITING_BEELINE\u0010\u0003\u0012\u0019\n\u0015ACTION_ERASER_WRITING\u0010\u0004\u0012\u0011\n\rACTION_DELETE\u0010\u0005\u0012\u000e\n\nACTION_SEE\u0010\u0006\u0012\u000f\n\u000bACTION_TEXT\u0010\u0007\u0012\u0011\n\rACTION_CURSOR\u0010\u0008\u0012\u0015\n\u0011ACTION_NEW_SELECT\u0010\t\u0012\u0013\n\u000fACTION_GEOMETRY\u0010\nB\u001d\n\u000ecom.zykj.boardB\u000bEzyModeEnumb\u0006proto3"

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
    sput-object v0, Lcom/zykj/board/EzyModeEnum;->a:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 15
    .line 16
    return-void
.end method

.method public static a()Lcom/google/protobuf/Descriptors$FileDescriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyModeEnum;->a:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    return-object v0
.end method
