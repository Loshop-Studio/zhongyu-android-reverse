.class public Lq/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq/u$a;,
        Lq/u$b;
    }
.end annotation


# static fields
.field public static final a:Lq/u;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lq/u;

    .line 2
    .line 3
    invoke-direct {v0}, Lq/u;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq/u;->a:Lq/u;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static c()Lq/u;
    .locals 1

    .line 1
    sget-object v0, Lq/u;->a:Lq/u;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    return p1
.end method

.method public b(Ljava/lang/Object;IILj/d;)Lq/m$a;
    .locals 0

    .line 1
    new-instance p2, Lq/m$a;

    .line 2
    .line 3
    new-instance p3, Lf0/b;

    .line 4
    .line 5
    invoke-direct {p3, p1}, Lf0/b;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance p4, Lq/u$b;

    .line 9
    .line 10
    invoke-direct {p4, p1}, Lq/u$b;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p2, p3, p4}, Lq/m$a;-><init>(Lj/b;Lk/d;)V

    .line 14
    .line 15
    .line 16
    return-object p2
.end method
