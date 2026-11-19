.class Lcom/ta/utdid2/device/c$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ta/utdid2/device/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ta/utdid2/device/c;->t()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/ta/utdid2/device/c;

.field final synthetic l:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ta/utdid2/device/c;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ta/utdid2/device/c$3;->b:Lcom/ta/utdid2/device/c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/ta/utdid2/device/c$3;->l:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/ta/utdid2/device/c$3;->b:Lcom/ta/utdid2/device/c;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ta/utdid2/device/c$3;->l:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/ta/utdid2/device/c;->a(Lcom/ta/utdid2/device/c;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/ta/utdid2/device/c$3;->b:Lcom/ta/utdid2/device/c;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/ta/utdid2/device/c;->a(Lcom/ta/utdid2/device/c;)Ll2/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ll2/c;->i()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lcom/ta/utdid2/device/c;->c(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lcom/ta/utdid2/device/c$3;->b:Lcom/ta/utdid2/device/c;

    .line 25
    .line 26
    invoke-static {v0}, Lcom/ta/utdid2/device/c;->a(Lcom/ta/utdid2/device/c;)Ll2/c;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ll2/c;->f()Z

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method
