.class Lcom/tendcloud/tenddata/dm$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/dm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field fp1:Lcom/tendcloud/tenddata/dm$c;

.field fp2:Lcom/tendcloud/tenddata/dm$c;

.field score:D

.field final synthetic this$0:Lcom/tendcloud/tenddata/dm;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/dm;Lcom/tendcloud/tenddata/dm$c;Lcom/tendcloud/tenddata/dm$c;D)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/dm$d;->this$0:Lcom/tendcloud/tenddata/dm;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/tendcloud/tenddata/dm$d;->fp1:Lcom/tendcloud/tenddata/dm$c;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/tendcloud/tenddata/dm$d;->fp2:Lcom/tendcloud/tenddata/dm$c;

    .line 9
    .line 10
    iput-wide p4, p0, Lcom/tendcloud/tenddata/dm$d;->score:D

    .line 11
    .line 12
    return-void
.end method
