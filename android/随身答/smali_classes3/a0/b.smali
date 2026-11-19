.class public abstract La0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcoil3/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcoil3/c$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La0/b;->a:Lcoil3/c$c;

    .line 8
    .line 9
    return-void
.end method

.method public static final a(Ly/m;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, La0/b;->a:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->b(Ly/m;Lcoil3/c$c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method
