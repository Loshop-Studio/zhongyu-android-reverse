.class public Lio/objectbox/Property;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ENTITY:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x77888ea02f223ccdL


# instance fields
.field public final converterClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lio/objectbox/converter/PropertyConverter<",
            "**>;>;"
        }
    .end annotation
.end field

.field public final customType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final dbName:Ljava/lang/String;

.field public final entity:Lio/objectbox/EntityInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/EntityInfo<",
            "TENTITY;>;"
        }
    .end annotation
.end field

.field public final id:I

.field private idVerified:Z

.field public final isId:Z

.field public final isVirtual:Z

.field public final name:Ljava/lang/String;

.field public final ordinal:I

.field public final type:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/EntityInfo<",
            "TENTITY;>;II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object v7, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 1
    invoke-direct/range {v0 .. v9}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/EntityInfo<",
            "TENTITY;>;II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v6, 0x0

    move-object/from16 v8, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move/from16 v7, p6

    .line 2
    invoke-direct/range {v0 .. v10}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 10
    .param p7    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/EntityInfo<",
            "TENTITY;>;II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    .line 3
    invoke-direct/range {v0 .. v9}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 11
    .param p7    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/Class;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/lang/Class;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/EntityInfo<",
            "TENTITY;>;II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lio/objectbox/converter/PropertyConverter<",
            "**>;>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    .line 4
    invoke-direct/range {v0 .. v10}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0
    .param p8    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/lang/Class;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/Class;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/objectbox/EntityInfo<",
            "TENTITY;>;II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lio/objectbox/converter/PropertyConverter<",
            "**>;>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lio/objectbox/Property;->entity:Lio/objectbox/EntityInfo;

    .line 7
    iput p2, p0, Lio/objectbox/Property;->ordinal:I

    .line 8
    iput p3, p0, Lio/objectbox/Property;->id:I

    .line 9
    iput-object p4, p0, Lio/objectbox/Property;->type:Ljava/lang/Class;

    .line 10
    iput-object p5, p0, Lio/objectbox/Property;->name:Ljava/lang/String;

    .line 11
    iput-boolean p6, p0, Lio/objectbox/Property;->isId:Z

    .line 12
    iput-boolean p7, p0, Lio/objectbox/Property;->isVirtual:Z

    .line 13
    iput-object p8, p0, Lio/objectbox/Property;->dbName:Ljava/lang/String;

    .line 14
    iput-object p9, p0, Lio/objectbox/Property;->converterClass:Ljava/lang/Class;

    .line 15
    iput-object p10, p0, Lio/objectbox/Property;->customType:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public between(Ljava/lang/Object;Ljava/lang/Object;)Lo5/b;
    .locals 1

    .line 1
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Landroid/support/v4/media/h;

    .line 6
    .line 7
    sget-object v0, Lio/objectbox/query/QueryCondition$PropertyCondition$Operation;->BETWEEN:Lio/objectbox/query/QueryCondition$PropertyCondition$Operation;

    .line 8
    .line 9
    invoke-direct {p2, p0, v0, p1}, Landroid/support/v4/media/h;-><init>(Lio/objectbox/Property;Lio/objectbox/query/QueryCondition$PropertyCondition$Operation;[Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public contains(Ljava/lang/String;)Lo5/b;
    .locals 1

    .line 1
    new-instance v0, Landroid/support/v4/media/h;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Landroid/support/v4/media/h;-><init>(Lio/objectbox/Property;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public endsWith(Ljava/lang/String;)Lo5/b;
    .locals 1

    .line 1
    new-instance v0, Landroid/support/v4/media/h;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Landroid/support/v4/media/h;-><init>(Lio/objectbox/Property;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public eq(Ljava/lang/Object;)Lo5/b;
    .locals 1

    .line 1
    new-instance v0, Landroid/support/v4/media/h;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Landroid/support/v4/media/h;-><init>(Lio/objectbox/Property;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public getEntityId()I
    .locals 1
    .annotation build Lio/objectbox/annotation/apihint/Internal;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/objectbox/Property;->entity:Lio/objectbox/EntityInfo;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/objectbox/EntityInfo;->getEntityId()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getId()I
    .locals 3
    .annotation build Lio/objectbox/annotation/apihint/Internal;
    .end annotation

    .line 1
    iget v0, p0, Lio/objectbox/Property;->id:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v2, "Illegal property ID "

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget v2, p0, Lio/objectbox/Property;->id:I

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, " for "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lio/objectbox/Property;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0
.end method

.method public gt(Ljava/lang/Object;)Lo5/b;
    .locals 1

    .line 1
    new-instance v0, Landroid/support/v4/media/h;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Landroid/support/v4/media/h;-><init>(Lio/objectbox/Property;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public in(Ljava/util/Collection;)Lo5/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)",
            "Lo5/b;"
        }
    .end annotation

    .line 2
    invoke-interface {p1}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/objectbox/Property;->in([Ljava/lang/Object;)Lo5/b;

    move-result-object p1

    return-object p1
.end method

.method public varargs in([Ljava/lang/Object;)Lo5/b;
    .locals 2

    .line 1
    new-instance v0, Landroid/support/v4/media/h;

    sget-object v1, Lio/objectbox/query/QueryCondition$PropertyCondition$Operation;->IN:Lio/objectbox/query/QueryCondition$PropertyCondition$Operation;

    invoke-direct {v0, p0, v1, p1}, Landroid/support/v4/media/h;-><init>(Lio/objectbox/Property;Lio/objectbox/query/QueryCondition$PropertyCondition$Operation;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public isIdVerified()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/objectbox/Property;->idVerified:Z

    .line 2
    .line 3
    return v0
.end method

.method public isNotNull()Lo5/b;
    .locals 3

    .line 1
    new-instance v0, Landroid/support/v4/media/h;

    .line 2
    .line 3
    sget-object v1, Lio/objectbox/query/QueryCondition$PropertyCondition$Operation;->IS_NOT_NULL:Lio/objectbox/query/QueryCondition$PropertyCondition$Operation;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, p0, v1, v2}, Landroid/support/v4/media/h;-><init>(Lio/objectbox/Property;Lio/objectbox/query/QueryCondition$PropertyCondition$Operation;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public isNull()Lo5/b;
    .locals 3

    .line 1
    new-instance v0, Landroid/support/v4/media/h;

    .line 2
    .line 3
    sget-object v1, Lio/objectbox/query/QueryCondition$PropertyCondition$Operation;->IS_NULL:Lio/objectbox/query/QueryCondition$PropertyCondition$Operation;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, p0, v1, v2}, Landroid/support/v4/media/h;-><init>(Lio/objectbox/Property;Lio/objectbox/query/QueryCondition$PropertyCondition$Operation;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public lt(Ljava/lang/Object;)Lo5/b;
    .locals 1

    .line 1
    new-instance v0, Landroid/support/v4/media/h;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Landroid/support/v4/media/h;-><init>(Lio/objectbox/Property;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public notEq(Ljava/lang/Object;)Lo5/b;
    .locals 1

    .line 1
    new-instance v0, Landroid/support/v4/media/h;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Landroid/support/v4/media/h;-><init>(Lio/objectbox/Property;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public startsWith(Ljava/lang/String;)Lo5/b;
    .locals 1

    .line 1
    new-instance v0, Landroid/support/v4/media/h;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Landroid/support/v4/media/h;-><init>(Lio/objectbox/Property;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Property \""

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lio/objectbox/Property;->name:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\" (ID: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lio/objectbox/Property;->id:I

    .line 19
    .line 20
    const-string v2, ")"

    .line 21
    .line 22
    invoke-static {v0, v2, v1}, Landroid/support/v4/media/f;->o(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method

.method public verifyId(I)V
    .locals 3

    .line 1
    iget v0, p0, Lio/objectbox/Property;->id:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lio/objectbox/Property;->idVerified:Z

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v0, Lio/objectbox/exception/DbException;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lio/objectbox/Property;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, " does not match ID in DB: "

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {v0, p1}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v1, "Illegal property ID "

    .line 46
    .line 47
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget v1, p0, Lio/objectbox/Property;->id:I

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, " for "

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lio/objectbox/Property;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1
.end method
