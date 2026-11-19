.class public interface abstract Lcom/zykj/sketch/EzyDrawBoard$ActionContentOrBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/EzyDrawBoard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ActionContentOrBuilder"
.end annotation


# virtual methods
.method public abstract getAction()Lcom/google/protobuf/Any;
.end method

.method public abstract getActionOrBuilder()Lcom/google/protobuf/AnyOrBuilder;
.end method

.method public abstract getGraphSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;
.end method

.method public abstract getGraphSnapshotOrBuilder()Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;
.end method

.method public abstract getResetData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
.end method

.method public abstract getResetDataOrBuilder()Lcom/zykj/sketch/EzyDrawBoard$GraphResetDataOrBuilder;
.end method

.method public abstract getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;
.end method

.method public abstract getTypeValue()I
.end method

.method public abstract hasAction()Z
.end method

.method public abstract hasGraphSnapshot()Z
.end method

.method public abstract hasResetData()Z
.end method
