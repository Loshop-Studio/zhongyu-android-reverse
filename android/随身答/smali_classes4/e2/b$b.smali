.class public abstract Le2/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Le2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le2/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Le2/b;-><init>(Le2/b$a;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Le2/b$b;->a:Le2/b;

    .line 8
    .line 9
    return-void
.end method

.method public static synthetic a()Le2/b;
    .locals 1

    .line 1
    sget-object v0, Le2/b$b;->a:Le2/b;

    .line 2
    .line 3
    return-object v0
.end method
