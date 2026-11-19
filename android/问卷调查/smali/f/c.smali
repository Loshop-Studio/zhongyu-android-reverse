.class public final Lf/c;
.super Ld/e/b;
.source ""

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld/e/b<",
        "Lf/b;",
        ">;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# static fields
.field public static final b:Lf/c$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf/c$a;-><init>(Ld/f/b/c;)V

    sput-object v0, Lf/c;->b:Lf/c$a;

    return-void
.end method
