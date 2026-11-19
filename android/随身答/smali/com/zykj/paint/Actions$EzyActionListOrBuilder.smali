.class public interface abstract Lcom/zykj/paint/Actions$EzyActionListOrBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/paint/Actions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "EzyActionListOrBuilder"
.end annotation


# virtual methods
.method public abstract getAction(I)Lcom/zykj/paint/Actions$EzyAction;
.end method

.method public abstract getActionCount()I
.end method

.method public abstract getActionList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyAction;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getActionOrBuilder(I)Lcom/zykj/paint/Actions$EzyActionOrBuilder;
.end method

.method public abstract getActionOrBuilderList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/paint/Actions$EzyActionOrBuilder;",
            ">;"
        }
    .end annotation
.end method
