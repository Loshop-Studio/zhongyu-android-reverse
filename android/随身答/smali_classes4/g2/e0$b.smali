.class public abstract Lg2/e0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg2/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Lg2/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lg2/e0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lg2/e0;-><init>(Lg2/e0$a;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lg2/e0$b;->a:Lg2/e0;

    .line 8
    .line 9
    return-void
.end method

.method public static synthetic a()Lg2/e0;
    .locals 1

    .line 1
    sget-object v0, Lg2/e0$b;->a:Lg2/e0;

    .line 2
    .line 3
    return-object v0
.end method
