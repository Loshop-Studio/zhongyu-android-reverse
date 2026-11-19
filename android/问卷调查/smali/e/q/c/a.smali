.class public final Le/q/c/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le/b;


# instance fields
.field public final b:Le/k;


# direct methods
.method public constructor <init>(Le/k;I)V
    .locals 0

    and-int/lit8 p1, p2, 0x1

    if-eqz p1, :cond_0

    sget-object p1, Le/k;->a:Le/k;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string p2, "defaultDns"

    .line 1
    invoke-static {p1, p2}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/q/c/a;->b:Le/k;

    return-void
.end method
