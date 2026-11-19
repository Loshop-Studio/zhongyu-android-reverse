.class public abstract Lh7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le7/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le7/r;

    .line 2
    .line 3
    const-string v1, "NO_OWNER"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Le7/r;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lh7/c;->a:Le7/r;

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic a(Lh7/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    check-cast p0, Lkotlinx/coroutines/sync/a;

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/sync/a;->g(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
