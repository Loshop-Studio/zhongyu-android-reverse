# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/view/EzySimpleBoardData$SimpleBoardDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;",
        "Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;",
        ">;",
        "Lcom/zykj/view/EzySimpleBoardData$SimpleBoardDataOrBuilder;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->q()Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/view/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public addAllPath(Ljava/lang/Iterable;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/zykj/view/EzySimpleBoardData$Path;",
            ">;)",
            "Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;"
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
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->a(Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;Ljava/lang/Iterable;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public addPath(ILcom/zykj/view/EzySimpleBoardData$Path$Builder;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;
    .locals 1

    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 8
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    .line 9
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p2

    check-cast p2, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 10
    invoke-static {v0, p1, p2}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->f(Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;ILcom/zykj/view/EzySimpleBoardData$Path;)V

    return-object p0
.end method

.method public addPath(ILcom/zykj/view/EzySimpleBoardData$Path;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-static {v0, p1, p2}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->f(Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;ILcom/zykj/view/EzySimpleBoardData$Path;)V

    return-object p0
.end method

.method public addPath(Lcom/zykj/view/EzySimpleBoardData$Path$Builder;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 6
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/EzySimpleBoardData$Path;

    invoke-static {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->j(Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;Lcom/zykj/view/EzySimpleBoardData$Path;)V

    return-object p0
.end method

.method public addPath(Lcom/zykj/view/EzySimpleBoardData$Path;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-static {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->j(Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;Lcom/zykj/view/EzySimpleBoardData$Path;)V

    return-object p0
.end method

.method public clearPath()Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->k(Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public getPath(I)Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->getPath(I)Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public getPathCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->getPathCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getPathList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/view/EzySimpleBoardData$Path;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->getPathList()Ljava/util/List;

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

.method public removePath(I)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->m(Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;I)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setPath(ILcom/zykj/view/EzySimpleBoardData$Path$Builder;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    .line 5
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p2

    check-cast p2, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 6
    invoke-static {v0, p1, p2}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->o(Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;ILcom/zykj/view/EzySimpleBoardData$Path;)V

    return-object p0
.end method

.method public setPath(ILcom/zykj/view/EzySimpleBoardData$Path;)Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;

    invoke-static {v0, p1, p2}, Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;->o(Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;ILcom/zykj/view/EzySimpleBoardData$Path;)V

    return-object p0
.end method
