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


# instance fields
.field public final c:Lio/objectbox/EntityInfo;

.field public final d:Lio/objectbox/EntityInfo;

.field public final e:Lio/objectbox/Property;

.field public final f:I

.field public final g:Lio/objectbox/internal/ToOneGetter;

.field public final h:Lio/objectbox/internal/ToManyGetter;

.field public final i:Lio/objectbox/internal/ToOneGetter;

.field public final j:Lio/objectbox/internal/ToManyGetter;

.field public final k:I


# direct methods
.method public constructor <init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->c:Lio/objectbox/EntityInfo;

    .line 3
    iput-object p2, p0, Lio/objectbox/relation/RelationInfo;->d:Lio/objectbox/EntityInfo;

    .line 4
    iput-object p3, p0, Lio/objectbox/relation/RelationInfo;->e:Lio/objectbox/Property;

    .line 5
    iput-object p4, p0, Lio/objectbox/relation/RelationInfo;->g:Lio/objectbox/internal/ToOneGetter;

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lio/objectbox/relation/RelationInfo;->f:I

    const/4 p2, 0x0

    .line 7
    iput-object p2, p0, Lio/objectbox/relation/RelationInfo;->i:Lio/objectbox/internal/ToOneGetter;

    .line 8
    iput-object p2, p0, Lio/objectbox/relation/RelationInfo;->j:Lio/objectbox/internal/ToManyGetter;

    .line 9
    iput-object p2, p0, Lio/objectbox/relation/RelationInfo;->h:Lio/objectbox/internal/ToManyGetter;

    .line 10
    iput p1, p0, Lio/objectbox/relation/RelationInfo;->k:I

    return-void
.end method

.method public constructor <init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;I)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->c:Lio/objectbox/EntityInfo;

    .line 23
    iput-object p2, p0, Lio/objectbox/relation/RelationInfo;->d:Lio/objectbox/EntityInfo;

    .line 24
    iput-object p3, p0, Lio/objectbox/relation/RelationInfo;->h:Lio/objectbox/internal/ToManyGetter;

    .line 25
    iput p4, p0, Lio/objectbox/relation/RelationInfo;->k:I

    const/4 p1, 0x0

    .line 26
    iput p1, p0, Lio/objectbox/relation/RelationInfo;->f:I

    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->e:Lio/objectbox/Property;

    .line 28
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->g:Lio/objectbox/internal/ToOneGetter;

    .line 29
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->i:Lio/objectbox/internal/ToOneGetter;

    .line 30
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->j:Lio/objectbox/internal/ToManyGetter;

    return-void
.end method

.method public constructor <init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lio/objectbox/relation/RelationInfo;->c:Lio/objectbox/EntityInfo;

    .line 13
    iput-object p2, p0, Lio/objectbox/relation/RelationInfo;->d:Lio/objectbox/EntityInfo;

    .line 14
    iput-object p4, p0, Lio/objectbox/relation/RelationInfo;->e:Lio/objectbox/Property;

    .line 15
    iput-object p3, p0, Lio/objectbox/relation/RelationInfo;->h:Lio/objectbox/internal/ToManyGetter;

    .line 16
    iput-object p5, p0, Lio/objectbox/relation/RelationInfo;->i:Lio/objectbox/internal/ToOneGetter;

    const/4 p1, 0x0

    .line 17
    iput p1, p0, Lio/objectbox/relation/RelationInfo;->f:I

    const/4 p2, 0x0

    .line 18
    iput-object p2, p0, Lio/objectbox/relation/RelationInfo;->g:Lio/objectbox/internal/ToOneGetter;

    .line 19
    iput-object p2, p0, Lio/objectbox/relation/RelationInfo;->j:Lio/objectbox/internal/ToManyGetter;

    .line 20
    iput p1, p0, Lio/objectbox/relation/RelationInfo;->k:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "RelationInfo from "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lio/objectbox/relation/RelationInfo;->c:Lio/objectbox/EntityInfo;

    .line 12
    .line 13
    invoke-interface {v1}, Lio/objectbox/EntityInfo;->j()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, " to "

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lio/objectbox/relation/RelationInfo;->d:Lio/objectbox/EntityInfo;

    .line 26
    .line 27
    invoke-interface {v1}, Lio/objectbox/EntityInfo;->j()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0
.end method
