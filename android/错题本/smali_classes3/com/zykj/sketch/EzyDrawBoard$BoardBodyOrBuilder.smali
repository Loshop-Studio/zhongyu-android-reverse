.class public interface abstract Lcom/zykj/sketch/EzyDrawBoard$BoardBodyOrBuilder;
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
    name = "BoardBodyOrBuilder"
.end annotation


# virtual methods
.method public abstract getActionContent(I)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
.end method

.method public abstract getActionContentCount()I
.end method

.method public abstract getActionContentList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getActionContentOrBuilder(I)Lcom/zykj/sketch/EzyDrawBoard$ActionContentOrBuilder;
.end method

.method public abstract getActionContentOrBuilderList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContentOrBuilder;",
            ">;"
        }
    .end annotation
.end method
