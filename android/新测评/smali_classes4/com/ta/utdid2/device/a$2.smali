.class Lcom/ta/utdid2/device/a$2;
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
.field final synthetic b:Lcom/ta/utdid2/device/a;

.field final synthetic g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ta/utdid2/device/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ta/utdid2/device/a$2;->b:Lcom/ta/utdid2/device/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/ta/utdid2/device/a$2;->g:Ljava/lang/String;

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
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ta/utdid2/device/a$2;->g:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Li2/e;->c(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Li2/e;->l()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_2

    .line 15
    .line 16
    iget-object v1, p0, Lcom/ta/utdid2/device/a$2;->g:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v1}, Lf2/a;->a(Ljava/lang/String;)Lf2/b;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v0}, Lf2/a;->a(Ljava/lang/String;)Lf2/b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lf2/b;->c()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Lf2/b;->b()J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    invoke-virtual {v1}, Lf2/b;->b()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    cmp-long v0, v2, v0

    .line 41
    .line 42
    if-gez v0, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-void

    .line 46
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ta/utdid2/device/a$2;->g:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0}, Li2/e;->f(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    iget-object v0, p0, Lcom/ta/utdid2/device/a$2;->g:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0}, Li2/e;->f(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
