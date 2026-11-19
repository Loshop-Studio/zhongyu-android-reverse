.class public abstract Lg2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg2/a$b;,
        Lg2/a$c;
    }
.end annotation


# static fields
.field public static final a:Lg2/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lg2/a$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lg2/a$b;-><init>(Lg2/a$a;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lg2/a;->a:Lg2/a$c;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    sget-object v0, Lg2/a;->a:Lg2/a$c;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lg2/a$c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lg2/a;->a:Lg2/a$c;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lg2/a$c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
