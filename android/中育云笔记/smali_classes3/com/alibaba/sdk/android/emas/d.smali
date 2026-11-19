.class public Lcom/alibaba/sdk/android/emas/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/alibaba/sdk/android/emas/e;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/alibaba/sdk/android/emas/b;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/alibaba/sdk/android/emas/e;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/alibaba/sdk/android/emas/b;->a:Lcom/alibaba/sdk/android/emas/b;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/alibaba/sdk/android/emas/d;-><init>(Ljava/util/List;Lcom/alibaba/sdk/android/emas/b;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/alibaba/sdk/android/emas/b;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/alibaba/sdk/android/emas/e;",
            ">;",
            "Lcom/alibaba/sdk/android/emas/b;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/d;->b:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/alibaba/sdk/android/emas/d;->c:Lcom/alibaba/sdk/android/emas/b;

    .line 5
    iput-object p3, p0, Lcom/alibaba/sdk/android/emas/d;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/alibaba/sdk/android/emas/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/d;->c:Lcom/alibaba/sdk/android/emas/b;

    return-object v0
.end method

.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/alibaba/sdk/android/emas/e;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/d;->b:Ljava/util/List;

    return-object v0
.end method

.method public getLocation()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/d;->c:Lcom/alibaba/sdk/android/emas/b;

    .line 2
    .line 3
    sget-object v1, Lcom/alibaba/sdk/android/emas/b;->b:Lcom/alibaba/sdk/android/emas/b;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/d;->c:Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method
