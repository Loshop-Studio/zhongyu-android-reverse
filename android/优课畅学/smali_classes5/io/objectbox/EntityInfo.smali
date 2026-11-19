.class public interface abstract Lio/objectbox/EntityInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# virtual methods
.method public abstract getAllProperties()[Lio/objectbox/Property;
.end method

.method public abstract getCursorFactory()Ln6/b;
.end method

.method public abstract getDbName()Ljava/lang/String;
.end method

.method public abstract getEntityClass()Ljava/lang/Class;
.end method

.method public abstract getEntityId()I
.end method

.method public abstract getEntityName()Ljava/lang/String;
.end method

.method public abstract getIdGetter()Ln6/c;
.end method
