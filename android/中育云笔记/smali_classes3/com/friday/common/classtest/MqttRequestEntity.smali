.class public final Lcom/friday/common/classtest/MqttRequestEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final data:Lcom/friday/common/classtest/RequestScreencastData;

.field private final type:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILcom/friday/common/classtest/RequestScreencastData;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/friday/common/classtest/MqttRequestEntity;->type:I

    iput-object p2, p0, Lcom/friday/common/classtest/MqttRequestEntity;->data:Lcom/friday/common/classtest/RequestScreencastData;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/friday/common/classtest/RequestScreencastData;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/friday/common/classtest/MqttRequestEntity;-><init>(ILcom/friday/common/classtest/RequestScreencastData;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/common/classtest/MqttRequestEntity;ILcom/friday/common/classtest/RequestScreencastData;ILjava/lang/Object;)Lcom/friday/common/classtest/MqttRequestEntity;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/friday/common/classtest/MqttRequestEntity;->type:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/friday/common/classtest/MqttRequestEntity;->data:Lcom/friday/common/classtest/RequestScreencastData;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/classtest/MqttRequestEntity;->copy(ILcom/friday/common/classtest/RequestScreencastData;)Lcom/friday/common/classtest/MqttRequestEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/friday/common/classtest/MqttRequestEntity;->type:I

    return v0
.end method

.method public final component2()Lcom/friday/common/classtest/RequestScreencastData;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/classtest/MqttRequestEntity;->data:Lcom/friday/common/classtest/RequestScreencastData;

    return-object v0
.end method

.method public final copy(ILcom/friday/common/classtest/RequestScreencastData;)Lcom/friday/common/classtest/MqttRequestEntity;
    .locals 1

    new-instance v0, Lcom/friday/common/classtest/MqttRequestEntity;

    invoke-direct {v0, p1, p2}, Lcom/friday/common/classtest/MqttRequestEntity;-><init>(ILcom/friday/common/classtest/RequestScreencastData;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/common/classtest/MqttRequestEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/classtest/MqttRequestEntity;

    iget v1, p0, Lcom/friday/common/classtest/MqttRequestEntity;->type:I

    iget v3, p1, Lcom/friday/common/classtest/MqttRequestEntity;->type:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/common/classtest/MqttRequestEntity;->data:Lcom/friday/common/classtest/RequestScreencastData;

    iget-object p1, p1, Lcom/friday/common/classtest/MqttRequestEntity;->data:Lcom/friday/common/classtest/RequestScreencastData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getData()Lcom/friday/common/classtest/RequestScreencastData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/classtest/MqttRequestEntity;->data:Lcom/friday/common/classtest/RequestScreencastData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/classtest/MqttRequestEntity;->type:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/friday/common/classtest/MqttRequestEntity;->type:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/classtest/MqttRequestEntity;->data:Lcom/friday/common/classtest/RequestScreencastData;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/friday/common/classtest/RequestScreencastData;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcom/friday/common/classtest/MqttRequestEntity;->type:I

    iget-object v1, p0, Lcom/friday/common/classtest/MqttRequestEntity;->data:Lcom/friday/common/classtest/RequestScreencastData;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MqttRequestEntity(type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", data="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
