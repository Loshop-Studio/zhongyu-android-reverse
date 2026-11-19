# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/view/EzySimpleBoardData$Path$Builder;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/view/EzySimpleBoardData$PathOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/EzySimpleBoardData$Path;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lcom/zykj/view/EzySimpleBoardData$Path;",
        "Lcom/zykj/view/EzySimpleBoardData$Path$Builder;",
        ">;",
        "Lcom/zykj/view/EzySimpleBoardData$PathOrBuilder;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/zykj/view/EzySimpleBoardData$Path;->t()Lcom/zykj/view/EzySimpleBoardData$Path;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/view/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$Path$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public addAllPoint(Ljava/lang/Iterable;)Lcom/zykj/view/EzySimpleBoardData$Path$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/zykj/view/EzySimpleBoardData$PointF;",
            ">;)",
            "Lcom/zykj/view/EzySimpleBoardData$Path$Builder;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$Path;->a(Lcom/zykj/view/EzySimpleBoardData$Path;Ljava/lang/Iterable;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public addPoint(ILcom/zykj/view/EzySimpleBoardData$PointF$Builder;)Lcom/zykj/view/EzySimpleBoardData$Path$Builder;
    .locals 1

    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 8
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 9
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p2

    check-cast p2, Lcom/zykj/view/EzySimpleBoardData$PointF;

    .line 10
    invoke-static {v0, p1, p2}, Lcom/zykj/view/EzySimpleBoardData$Path;->f(Lcom/zykj/view/EzySimpleBoardData$Path;ILcom/zykj/view/EzySimpleBoardData$PointF;)V

    return-object p0
.end method

.method public addPoint(ILcom/zykj/view/EzySimpleBoardData$PointF;)Lcom/zykj/view/EzySimpleBoardData$Path$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-static {v0, p1, p2}, Lcom/zykj/view/EzySimpleBoardData$Path;->f(Lcom/zykj/view/EzySimpleBoardData$Path;ILcom/zykj/view/EzySimpleBoardData$PointF;)V

    return-object p0
.end method

.method public addPoint(Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;)Lcom/zykj/view/EzySimpleBoardData$Path$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 6
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/EzySimpleBoardData$PointF;

    invoke-static {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$Path;->j(Lcom/zykj/view/EzySimpleBoardData$Path;Lcom/zykj/view/EzySimpleBoardData$PointF;)V

    return-object p0
.end method

.method public addPoint(Lcom/zykj/view/EzySimpleBoardData$PointF;)Lcom/zykj/view/EzySimpleBoardData$Path$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-static {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$Path;->j(Lcom/zykj/view/EzySimpleBoardData$Path;Lcom/zykj/view/EzySimpleBoardData$PointF;)V

    return-object p0
.end method

.method public clearPaint()Lcom/zykj/view/EzySimpleBoardData$Path$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/EzySimpleBoardData$Path;->k(Lcom/zykj/view/EzySimpleBoardData$Path;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearPoint()Lcom/zykj/view/EzySimpleBoardData$Path$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/EzySimpleBoardData$Path;->m(Lcom/zykj/view/EzySimpleBoardData$Path;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public getPaint()Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/EzySimpleBoardData$Path;->getPaint()Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getPoint(I)Lcom/zykj/view/EzySimpleBoardData$PointF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$Path;->getPoint(I)Lcom/zykj/view/EzySimpleBoardData$PointF;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public getPointCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/EzySimpleBoardData$Path;->getPointCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getPointList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/view/EzySimpleBoardData$PointF;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/EzySimpleBoardData$Path;->getPointList()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public hasPaint()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/EzySimpleBoardData$Path;->hasPaint()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public mergePaint(Lcom/zykj/view/EzySimpleBoardData$Paint;)Lcom/zykj/view/EzySimpleBoardData$Path$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$Path;->o(Lcom/zykj/view/EzySimpleBoardData$Path;Lcom/zykj/view/EzySimpleBoardData$Paint;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public removePoint(I)Lcom/zykj/view/EzySimpleBoardData$Path$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$Path;->q(Lcom/zykj/view/EzySimpleBoardData$Path;I)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setPaint(Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;)Lcom/zykj/view/EzySimpleBoardData$Path$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/EzySimpleBoardData$Paint;

    invoke-static {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$Path;->r(Lcom/zykj/view/EzySimpleBoardData$Path;Lcom/zykj/view/EzySimpleBoardData$Paint;)V

    return-object p0
.end method

.method public setPaint(Lcom/zykj/view/EzySimpleBoardData$Paint;)Lcom/zykj/view/EzySimpleBoardData$Path$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-static {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$Path;->r(Lcom/zykj/view/EzySimpleBoardData$Path;Lcom/zykj/view/EzySimpleBoardData$Paint;)V

    return-object p0
.end method

.method public setPoint(ILcom/zykj/view/EzySimpleBoardData$PointF$Builder;)Lcom/zykj/view/EzySimpleBoardData$Path$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 5
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p2

    check-cast p2, Lcom/zykj/view/EzySimpleBoardData$PointF;

    .line 6
    invoke-static {v0, p1, p2}, Lcom/zykj/view/EzySimpleBoardData$Path;->s(Lcom/zykj/view/EzySimpleBoardData$Path;ILcom/zykj/view/EzySimpleBoardData$PointF;)V

    return-object p0
.end method

.method public setPoint(ILcom/zykj/view/EzySimpleBoardData$PointF;)Lcom/zykj/view/EzySimpleBoardData$Path$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-static {v0, p1, p2}, Lcom/zykj/view/EzySimpleBoardData$Path;->s(Lcom/zykj/view/EzySimpleBoardData$Path;ILcom/zykj/view/EzySimpleBoardData$PointF;)V

    return-object p0
.end method
