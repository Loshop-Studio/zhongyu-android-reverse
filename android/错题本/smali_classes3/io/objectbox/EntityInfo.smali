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

.annotation build Lio/objectbox/annotation/apihint/Internal;
.end annotation


# virtual methods
.method public abstract getAllProperties()[Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lio/objectbox/Property<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract getCursorFactory()Lm5/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm5/a;"
        }
    .end annotation
.end method

.method public abstract getDbName()Ljava/lang/String;
.end method

.method public abstract getEntityClass()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract getEntityId()I
.end method

.method public abstract getEntityName()Ljava/lang/String;
.end method

.method public abstract getIdGetter()Lm5/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm5/b;"
        }
    .end annotation
.end method

.method public abstract getIdProperty()Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/objectbox/Property<",
            "TT;>;"
        }
    .end annotation
.end method
