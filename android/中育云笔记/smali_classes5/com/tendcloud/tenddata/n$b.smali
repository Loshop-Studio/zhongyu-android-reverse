.class Lcom/tendcloud/tenddata/n$b;
.super Lcom/tendcloud/tenddata/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final mResourcePackageName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p2, v0}, Lcom/tendcloud/tenddata/n;-><init>(Landroid/content/Context;Lcom/tendcloud/tenddata/n$1;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lcom/tendcloud/tenddata/n$b;->mResourcePackageName:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/n;->initialize()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getLocalClassName(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/tendcloud/tenddata/n$b;->mResourcePackageName:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v0, ".R$id"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public getSystemClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    const-class v0, Landroid/R$id;

    .line 2
    .line 3
    return-object v0
.end method
