.class public abstract Lx0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lx0/m;
    .locals 1

    new-instance v0, Lx0/m$a;

    invoke-direct {v0}, Lx0/m$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Lx0/l;
.end method

.method public final b(Ljava/lang/String;)Lx0/l;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lx0/m;->a(Ljava/lang/String;)Lx0/l;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p1}, Lx0/l;->a(Ljava/lang/String;)Lx0/l;

    move-result-object v0

    :cond_0
    return-object v0
.end method
