.class Lcom/ta/utdid2/device/c$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ta/utdid2/device/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ta/utdid2/device/c;->f(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/ta/utdid2/device/c;

.field final synthetic k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ta/utdid2/device/c;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ta/utdid2/device/c$1;->b:Lcom/ta/utdid2/device/c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/ta/utdid2/device/c$1;->k:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public i()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ta/utdid2/device/c$1;->b:Lcom/ta/utdid2/device/c;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ta/utdid2/device/c$1;->k:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/ta/utdid2/device/c;->a(Lcom/ta/utdid2/device/c;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/ta/utdid2/device/c$1;->b:Lcom/ta/utdid2/device/c;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/ta/utdid2/device/c;->a(Lcom/ta/utdid2/device/c;)Ll2/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ll2/c;->f()Z

    .line 15
    .line 16
    .line 17
    return-void
.end method
