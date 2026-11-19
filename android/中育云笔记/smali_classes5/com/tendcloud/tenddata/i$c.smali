.class Lcom/tendcloud/tenddata/i$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field final eventName:Ljava/lang/String;

.field final properties:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final timeSentMillis:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Hashtable;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;J)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tendcloud/tenddata/i$c;->eventName:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/tendcloud/tenddata/i$c;->properties:Ljava/util/Hashtable;

    .line 7
    .line 8
    iput-wide p3, p0, Lcom/tendcloud/tenddata/i$c;->timeSentMillis:J

    .line 9
    .line 10
    return-void
.end method
