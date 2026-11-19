.class public Lcom/tendcloud/tenddata/bn;
.super Lcom/tendcloud/tenddata/bp;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/br;


# instance fields
.field private a:S

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/bp;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/bn;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()S
    .locals 1

    .line 1
    iget-short v0, p0, Lcom/tendcloud/tenddata/bn;->a:S

    .line 2
    .line 3
    return v0
.end method

.method public setHttpStatus(S)V
    .locals 0

    .line 1
    iput-short p1, p0, Lcom/tendcloud/tenddata/bn;->a:S

    .line 2
    .line 3
    return-void
.end method

.method public setHttpStatusMessage(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/bn;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
