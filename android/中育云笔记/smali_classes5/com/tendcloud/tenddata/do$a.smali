.class Lcom/tendcloud/tenddata/do$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/do;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public fp1:Lcom/tendcloud/tenddata/dn;

.field public fp2:Lcom/tendcloud/tenddata/dn;

.field public score:D

.field final synthetic this$0:Lcom/tendcloud/tenddata/do;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/do;Lcom/tendcloud/tenddata/dn;Lcom/tendcloud/tenddata/dn;D)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/do$a;->this$0:Lcom/tendcloud/tenddata/do;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/tendcloud/tenddata/do$a;->fp1:Lcom/tendcloud/tenddata/dn;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/tendcloud/tenddata/do$a;->fp2:Lcom/tendcloud/tenddata/dn;

    .line 9
    .line 10
    iput-wide p4, p0, Lcom/tendcloud/tenddata/do$a;->score:D

    .line 11
    .line 12
    return-void
.end method
