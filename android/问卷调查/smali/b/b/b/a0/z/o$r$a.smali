.class public Lb/b/b/a0/z/o$r$a;
.super Lb/b/b/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/b/b/a0/z/o$r;->a(Lb/b/b/i;Lb/b/b/b0/a;)Lb/b/b/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb/b/b/x<",
        "Ljava/sql/Timestamp;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lb/b/b/x;


# direct methods
.method public constructor <init>(Lb/b/b/a0/z/o$r;Lb/b/b/x;)V
    .locals 0

    iput-object p2, p0, Lb/b/b/a0/z/o$r$a;->a:Lb/b/b/x;

    invoke-direct {p0}, Lb/b/b/x;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb/b/b/c0/a;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lb/b/b/a0/z/o$r$a;->a:Lb/b/b/x;

    invoke-virtual {v0, p1}, Lb/b/b/x;->a(Lb/b/b/c0/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/sql/Timestamp;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public b(Lb/b/b/c0/c;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Ljava/sql/Timestamp;

    .line 1
    iget-object v0, p0, Lb/b/b/a0/z/o$r$a;->a:Lb/b/b/x;

    invoke-virtual {v0, p1, p2}, Lb/b/b/x;->b(Lb/b/b/c0/c;Ljava/lang/Object;)V

    return-void
.end method
