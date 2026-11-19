.class public Lcom/tendcloud/tenddata/ek;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/ek$a;
    }
.end annotation


# instance fields
.field public a:Lcom/tendcloud/tenddata/a;

.field public b:Lcom/tendcloud/tenddata/ek$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tendcloud/tenddata/ek;->a:Lcom/tendcloud/tenddata/a;

    .line 6
    .line 7
    sget-object v0, Lcom/tendcloud/tenddata/ek$a;->IMMEDIATELY:Lcom/tendcloud/tenddata/ek$a;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/tendcloud/tenddata/ek;->b:Lcom/tendcloud/tenddata/ek$a;

    .line 10
    .line 11
    return-void
.end method
