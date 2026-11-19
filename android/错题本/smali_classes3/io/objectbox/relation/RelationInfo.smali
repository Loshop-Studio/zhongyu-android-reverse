.class public Lio/objectbox/relation/RelationInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<SOURCE:",
        "Ljava/lang/Object;",
        "TARGET:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation

.annotation build Lio/objectbox/annotation/apihint/Internal;
.end annotation

.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x66e021d265a22e18L


# instance fields
.field public final backlinkToManyGetter:Lio/objectbox/internal/ToManyGetter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/internal/ToManyGetter<",
            "TTARGET;>;"
        }
    .end annotation
.end field

.field public final backlinkToOneGetter:Lio/objectbox/internal/ToOneGetter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/internal/ToOneGetter<",
            "TTARGET;>;"
        }
    .end annotation
.end field

.field public final relationId:I

.field public final sourceInfo:Lio/objectbox/EntityInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/EntityInfo<",
            "TSOURCE;>;"
        }
    .end annotation
.end field

.field public final targetIdProperty:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "*>;"
        }
    .end annotation
.end field

.field public final targetInfo:Lio/objectbox/EntityInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/EntityInfo<",
            "TTARGET;>;"
        }
    .end annotation
.end field

.field public final targetRelationId:I

.field public final toManyGetter:Lio/objectbox/internal/ToManyGetter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/internal/ToManyGetter<",
            "TSOURCE;>;"
        }
    .end annotation
.end field

.field public final toOneGetter:Lio/objectbox/internal/ToOneGetter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/internal/ToOneGetter<",
            "TSOURCE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/EntityInfo<",
            "TSOURCE;>;",
            "Lio/objectbox/EntityInfo<",
            "TTARGET;>;",
            "Lio/objectbox/Property<",
            "TSOURCE;>;",
            "Lio/objectbox/internal/ToOneGetter<",
            "TSOURCE;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->sourceInfo:Lio/objectbox/EntityInfo;

    .line 3
    iput-object p2, p0, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 4
    iput-object p3, p0, Lio/objectbox/relation/RelationInfo;->targetIdProperty:Lio/objectbox/Property;

    .line 5
    iput-object p4, p0, Lio/objectbox/relation/RelationInfo;->toOneGetter:Lio/objectbox/internal/ToOneGetter;

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lio/objectbox/relation/RelationInfo;->targetRelationId:I

    const/4 p2, 0x0

    .line 7
    iput-object p2, p0, Lio/objectbox/relation/RelationInfo;->backlinkToOneGetter:Lio/objectbox/internal/ToOneGetter;

    .line 8
    iput-object p2, p0, Lio/objectbox/relation/RelationInfo;->backlinkToManyGetter:Lio/objectbox/internal/ToManyGetter;

    .line 9
    iput-object p2, p0, Lio/objectbox/relation/RelationInfo;->toManyGetter:Lio/objectbox/internal/ToManyGetter;

    .line 10
    iput p1, p0, Lio/objectbox/relation/RelationInfo;->relationId:I

    return-void
.end method

.method public constructor <init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/EntityInfo<",
            "TSOURCE;>;",
            "Lio/objectbox/EntityInfo<",
            "TTARGET;>;",
            "Lio/objectbox/internal/ToManyGetter<",
            "TSOURCE;>;I)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->sourceInfo:Lio/objectbox/EntityInfo;

    .line 33
    iput-object p2, p0, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 34
    iput-object p3, p0, Lio/objectbox/relation/RelationInfo;->toManyGetter:Lio/objectbox/internal/ToManyGetter;

    .line 35
    iput p4, p0, Lio/objectbox/relation/RelationInfo;->relationId:I

    const/4 p1, 0x0

    .line 36
    iput p1, p0, Lio/objectbox/relation/RelationInfo;->targetRelationId:I

    const/4 p1, 0x0

    .line 37
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->targetIdProperty:Lio/objectbox/Property;

    .line 38
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->toOneGetter:Lio/objectbox/internal/ToOneGetter;

    .line 39
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->backlinkToOneGetter:Lio/objectbox/internal/ToOneGetter;

    .line 40
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->backlinkToManyGetter:Lio/objectbox/internal/ToManyGetter;

    return-void
.end method

.method public constructor <init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/EntityInfo<",
            "TSOURCE;>;",
            "Lio/objectbox/EntityInfo<",
            "TTARGET;>;",
            "Lio/objectbox/internal/ToManyGetter<",
            "TSOURCE;>;",
            "Lio/objectbox/Property<",
            "TTARGET;>;",
            "Lio/objectbox/internal/ToOneGetter<",
            "TTARGET;>;)V"
        }
    .end annotation

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->sourceInfo:Lio/objectbox/EntityInfo;

    .line 13
    iput-object p2, p0, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 14
    iput-object p4, p0, Lio/objectbox/relation/RelationInfo;->targetIdProperty:Lio/objectbox/Property;

    .line 15
    iput-object p3, p0, Lio/objectbox/relation/RelationInfo;->toManyGetter:Lio/objectbox/internal/ToManyGetter;

    .line 16
    iput-object p5, p0, Lio/objectbox/relation/RelationInfo;->backlinkToOneGetter:Lio/objectbox/internal/ToOneGetter;

    const/4 p1, 0x0

    .line 17
    iput p1, p0, Lio/objectbox/relation/RelationInfo;->targetRelationId:I

    const/4 p2, 0x0

    .line 18
    iput-object p2, p0, Lio/objectbox/relation/RelationInfo;->toOneGetter:Lio/objectbox/internal/ToOneGetter;

    .line 19
    iput-object p2, p0, Lio/objectbox/relation/RelationInfo;->backlinkToManyGetter:Lio/objectbox/internal/ToManyGetter;

    .line 20
    iput p1, p0, Lio/objectbox/relation/RelationInfo;->relationId:I

    return-void
.end method

.method public constructor <init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;Lio/objectbox/internal/ToManyGetter;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/EntityInfo<",
            "TSOURCE;>;",
            "Lio/objectbox/EntityInfo<",
            "TTARGET;>;",
            "Lio/objectbox/internal/ToManyGetter<",
            "TSOURCE;>;",
            "Lio/objectbox/internal/ToManyGetter<",
            "TTARGET;>;I)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->sourceInfo:Lio/objectbox/EntityInfo;

    .line 23
    iput-object p2, p0, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 24
    iput-object p3, p0, Lio/objectbox/relation/RelationInfo;->toManyGetter:Lio/objectbox/internal/ToManyGetter;

    .line 25
    iput p5, p0, Lio/objectbox/relation/RelationInfo;->targetRelationId:I

    .line 26
    iput-object p4, p0, Lio/objectbox/relation/RelationInfo;->backlinkToManyGetter:Lio/objectbox/internal/ToManyGetter;

    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->targetIdProperty:Lio/objectbox/Property;

    .line 28
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->toOneGetter:Lio/objectbox/internal/ToOneGetter;

    .line 29
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->backlinkToOneGetter:Lio/objectbox/internal/ToOneGetter;

    const/4 p1, 0x0

    .line 30
    iput p1, p0, Lio/objectbox/relation/RelationInfo;->relationId:I

    return-void
.end method


# virtual methods
.method public isBacklink()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/RelationInfo;->backlinkToManyGetter:Lio/objectbox/internal/ToManyGetter;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lio/objectbox/relation/RelationInfo;->backlinkToOneGetter:Lio/objectbox/internal/ToOneGetter;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "RelationInfo from "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lio/objectbox/relation/RelationInfo;->sourceInfo:Lio/objectbox/EntityInfo;

    .line 9
    .line 10
    invoke-interface {v1}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, " to "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lio/objectbox/relation/RelationInfo;->targetInfo:Lio/objectbox/EntityInfo;

    .line 23
    .line 24
    invoke-interface {v1}, Lio/objectbox/EntityInfo;->getEntityClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method
