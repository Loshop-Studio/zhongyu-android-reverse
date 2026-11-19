.class Lcom/tendcloud/tenddata/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field final imageUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final visitor:Lcom/tendcloud/tenddata/t;


# direct methods
.method private constructor <init>(Lcom/tendcloud/tenddata/t;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tendcloud/tenddata/t;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tendcloud/tenddata/h$a;->visitor:Lcom/tendcloud/tenddata/t;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/tendcloud/tenddata/h$a;->imageUrls:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method
