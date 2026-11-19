# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/view/EzySimpleBoardData$PointFOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/EzySimpleBoardData$PointF;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lcom/zykj/view/EzySimpleBoardData$PointF;",
        "Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;",
        ">;",
        "Lcom/zykj/view/EzySimpleBoardData$PointFOrBuilder;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/zykj/view/EzySimpleBoardData$PointF;->e()Lcom/zykj/view/EzySimpleBoardData$PointF;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public addAllValue(Ljava/lang/Iterable;)Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/lang/Float;",
            ">;)",
            "Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;"
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
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$PointF;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$PointF;->a(Lcom/zykj/view/EzySimpleBoardData$PointF;Ljava/lang/Iterable;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public addValue(F)Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$PointF;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$PointF;->b(Lcom/zykj/view/EzySimpleBoardData$PointF;F)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearValue()Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$PointF;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/EzySimpleBoardData$PointF;->c(Lcom/zykj/view/EzySimpleBoardData$PointF;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public getValue(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$PointF;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$PointF;->getValue(I)F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public getValueCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$PointF;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/EzySimpleBoardData$PointF;->getValueCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getValueList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$PointF;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/EzySimpleBoardData$PointF;->getValueList()Ljava/util/List;

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

.method public setValue(IF)Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$PointF;

    .line 7
    .line 8
    invoke-static {v0, p1, p2}, Lcom/zykj/view/EzySimpleBoardData$PointF;->d(Lcom/zykj/view/EzySimpleBoardData$PointF;IF)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
