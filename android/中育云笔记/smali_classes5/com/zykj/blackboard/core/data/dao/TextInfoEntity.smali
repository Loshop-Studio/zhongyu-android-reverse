# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lio/objectbox/annotation/Entity;
.end annotation


# instance fields
.field transient __boxStore:Lio/objectbox/BoxStore;

.field private color:I

.field private content:Ljava/lang/String;

.field private id:J

.field public record:Lio/objectbox/relation/ToOne;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/ToOne<",
            "Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;",
            ">;"
        }
    .end annotation
.end field

.field private style:I

.field private textSize:F

.field private width:F


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x3f

    const/4 v9, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;-><init>(JFIFILjava/lang/String;ILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(JFIFILjava/lang/String;)V
    .locals 2

    const-string v0, "content"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/objectbox/relation/ToOne;

    sget-object v1, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->p:Lio/objectbox/relation/RelationInfo;

    invoke-direct {v0, p0, v1}, Lio/objectbox/relation/ToOne;-><init>(Ljava/lang/Object;Lio/objectbox/relation/RelationInfo;)V

    iput-object v0, p0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->record:Lio/objectbox/relation/ToOne;

    .line 3
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->id:J

    .line 4
    iput p3, p0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->width:F

    .line 5
    iput p4, p0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->color:I

    .line 6
    iput p5, p0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->textSize:F

    .line 7
    iput p6, p0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->style:I

    .line 8
    iput-object p7, p0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->content:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(JFIFILjava/lang/String;ILkotlin/jvm/internal/n;)V
    .locals 7

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    move-wide v0, p1

    :goto_0
    and-int/lit8 v2, p8, 0x2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, p3

    :goto_1
    and-int/lit8 v4, p8, 0x4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    move v4, p4

    :goto_2
    and-int/lit8 v6, p8, 0x8

    if-eqz v6, :cond_3

    goto :goto_3

    :cond_3
    move v3, p5

    :goto_3
    and-int/lit8 v6, p8, 0x10

    if-eqz v6, :cond_4

    goto :goto_4

    :cond_4
    move v5, p6

    :goto_4
    and-int/lit8 v6, p8, 0x20

    if-eqz v6, :cond_5

    .line 9
    const-string v6, ""

    move-object p8, v6

    :goto_5
    move-object p1, p0

    move-wide p2, v0

    move p4, v2

    move p6, v3

    move p5, v4

    move p7, v5

    goto :goto_6

    :cond_5
    move-object p8, p7

    goto :goto_5

    .line 10
    :goto_6
    invoke-direct/range {p1 .. p8}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;-><init>(JFIFILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->color:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()Lio/objectbox/relation/ToOne;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->record:Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "record"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->style:I

    .line 2
    .line 3
    return v0
.end method

.method public final f()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->textSize:F

    .line 2
    .line 3
    return v0
.end method

.method public final g()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->width:F

    .line 2
    .line 3
    return v0
.end method

.method public final h()V
    .locals 2

    .line 1
    sget-object v0, Lna/d;->a:Lna/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p0}, Ljc/a;->m(Ljava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final i(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->id:J

    .line 2
    .line 3
    return-void
.end method
