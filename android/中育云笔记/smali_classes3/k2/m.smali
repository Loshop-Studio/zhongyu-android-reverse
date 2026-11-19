.class public abstract Lk2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk2/m$a;
    }
.end annotation


# static fields
.field public static final a:Lk2/m$a;

.field public static b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk2/m$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lk2/m$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lk2/m;->a:Lk2/m$a;

    .line 8
    .line 9
    return-void
.end method

.method public static final synthetic a()J
    .locals 2

    .line 1
    sget-wide v0, Lk2/m;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic b(J)V
    .locals 0

    .line 1
    sput-wide p0, Lk2/m;->b:J

    .line 2
    .line 3
    return-void
.end method
