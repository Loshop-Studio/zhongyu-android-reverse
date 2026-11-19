.class public Lcom/tendcloud/tenddata/fj;
.super Lcom/tendcloud/tenddata/fk;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/fk;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tendcloud/tenddata/cp;->c(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
