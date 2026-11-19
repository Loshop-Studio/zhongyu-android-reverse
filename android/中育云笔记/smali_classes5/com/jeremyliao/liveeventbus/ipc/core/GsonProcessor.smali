.class public Lcom/jeremyliao/liveeventbus/ipc/core/GsonProcessor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jeremyliao/liveeventbus/ipc/core/Processor;


# instance fields
.field private final jsonConverter:Lcom/jeremyliao/liveeventbus/ipc/json/JsonConverter;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/jeremyliao/liveeventbus/ipc/json/GsonConverter;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/jeremyliao/liveeventbus/ipc/json/GsonConverter;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/jeremyliao/liveeventbus/ipc/core/GsonProcessor;->jsonConverter:Lcom/jeremyliao/liveeventbus/ipc/json/JsonConverter;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public createFromBundle(Landroid/os/Bundle;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, "leb_ipc_value"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "leb_ipc_class_name"

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    const/16 v1, 0x2e

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, -0x1

    .line 25
    if-eq v1, v2, :cond_0

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v2, "$"

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const/4 p1, 0x0

    .line 64
    :goto_0
    iget-object v1, p0, Lcom/jeremyliao/liveeventbus/ipc/core/GsonProcessor;->jsonConverter:Lcom/jeremyliao/liveeventbus/ipc/json/JsonConverter;

    .line 65
    .line 66
    invoke-interface {v1, v0, p1}, Lcom/jeremyliao/liveeventbus/ipc/json/JsonConverter;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1
.end method

.method public writeToBundle(Landroid/os/Bundle;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/jeremyliao/liveeventbus/ipc/core/GsonProcessor;->jsonConverter:Lcom/jeremyliao/liveeventbus/ipc/json/JsonConverter;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Lcom/jeremyliao/liveeventbus/ipc/json/JsonConverter;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "leb_ipc_value"

    .line 8
    .line 9
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const-string v0, "leb_ipc_class_name"

    .line 21
    .line 22
    invoke-virtual {p1, v0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1
.end method
