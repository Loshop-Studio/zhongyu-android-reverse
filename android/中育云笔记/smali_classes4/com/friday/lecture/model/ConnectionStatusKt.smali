.class public final Lcom/friday/lecture/model/ConnectionStatusKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final convert2ConnectMode(I)Lcom/friday/lecture/model/ConnectMode;
    .locals 2

    .line 1
    sget-object v0, Lcom/friday/lecture/model/ConnectMode$IP;->INSTANCE:Lcom/friday/lecture/model/ConnectMode$IP;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/lecture/model/ConnectMode;->getPasswordMaxSize()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ne p0, v1, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    sget-object p0, Lcom/friday/lecture/model/ConnectMode$Code;->INSTANCE:Lcom/friday/lecture/model/ConnectMode$Code;

    .line 11
    .line 12
    return-object p0
.end method
