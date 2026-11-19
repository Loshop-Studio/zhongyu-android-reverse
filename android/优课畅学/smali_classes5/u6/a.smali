.class public abstract Lu6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu6/a$b;
    }
.end annotation


# static fields
.field public static final a:Ls6/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lu6/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lu6/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lt6/a;->d(Ljava/util/concurrent/Callable;)Ls6/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lu6/a;->a:Ls6/f;

    .line 11
    .line 12
    return-void
.end method

.method public static a()Ls6/f;
    .locals 1

    .line 1
    sget-object v0, Lu6/a;->a:Ls6/f;

    .line 2
    .line 3
    invoke-static {v0}, Lt6/a;->e(Ls6/f;)Ls6/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
