# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/view/EzySimpleBoardData$PaintOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/EzySimpleBoardData$Paint;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lcom/zykj/view/EzySimpleBoardData$Paint;",
        "Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;",
        ">;",
        "Lcom/zykj/view/EzySimpleBoardData$PaintOrBuilder;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/zykj/view/EzySimpleBoardData$Paint;->q()Lcom/zykj/view/EzySimpleBoardData$Paint;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/view/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public clearColor()Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/EzySimpleBoardData$Paint;->a(Lcom/zykj/view/EzySimpleBoardData$Paint;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearIsDashed()Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/EzySimpleBoardData$Paint;->f(Lcom/zykj/view/EzySimpleBoardData$Paint;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public clearWidth()Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/EzySimpleBoardData$Paint;->j(Lcom/zykj/view/EzySimpleBoardData$Paint;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public getColor()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/EzySimpleBoardData$Paint;->getColor()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getIsDashed()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/EzySimpleBoardData$Paint;->getIsDashed()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getWidth()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/EzySimpleBoardData$Paint;->getWidth()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public setColor(I)Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$Paint;->k(Lcom/zykj/view/EzySimpleBoardData$Paint;I)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setIsDashed(Z)Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$Paint;->m(Lcom/zykj/view/EzySimpleBoardData$Paint;Z)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public setWidth(F)Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 5
    .line 6
    check-cast v0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/view/EzySimpleBoardData$Paint;->o(Lcom/zykj/view/EzySimpleBoardData$Paint;F)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
