.class public final Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/converter/PropertyConverter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/converter/PropertyConverter<",
        "Lcom/zykj/board/EzyCommandEnum$CommandEnum;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public convertToDatabaseValue(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)Ljava/lang/Integer;
    .locals 0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->getNumber()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic convertToDatabaseValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;->convertToDatabaseValue(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public convertToEntityProperty(Ljava/lang/Integer;)Lcom/zykj/board/EzyCommandEnum$CommandEnum;
    .locals 1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->a(I)Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    move-result-object p1

    const-string v0, "forNumber(databaseValue ?: 0)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic convertToEntityProperty(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;->convertToEntityProperty(Ljava/lang/Integer;)Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    move-result-object p1

    return-object p1
.end method
