.class public interface abstract Lcom/zykj/sketch/EzyDrawBoard$BoardBodyV1OrBuilder;
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
    name = "BoardBodyV1OrBuilder"
.end annotation


# virtual methods
.method public abstract getActionContent(I)Lcom/google/protobuf/Any;
.end method

.method public abstract getActionContentCount()I
.end method

.method public abstract getActionContentList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/Any;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getActionContentOrBuilder(I)Lcom/google/protobuf/AnyOrBuilder;
.end method

.method public abstract getActionContentOrBuilderList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/protobuf/AnyOrBuilder;",
            ">;"
        }
    .end annotation
.end method
