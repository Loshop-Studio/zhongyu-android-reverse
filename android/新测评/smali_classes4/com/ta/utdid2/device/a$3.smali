.class Lcom/ta/utdid2/device/a$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ta/utdid2/device/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ta/utdid2/device/a;->q()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/ta/utdid2/device/a;

.field final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ta/utdid2/device/a;Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ta/utdid2/device/a$3;->b:Lcom/ta/utdid2/device/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/ta/utdid2/device/a$3;->h:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/ta/utdid2/device/a$3;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public i()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ta/utdid2/device/a$3;->h:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Li2/e;->c(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/ta/utdid2/device/a$3;->a:Landroid/content/Context;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/ta/utdid2/device/a$3;->h:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0, v1}, Li2/e;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
