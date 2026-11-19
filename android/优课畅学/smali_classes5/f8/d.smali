.class public final Lf8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf8/g;
.implements Lf8/c;


# static fields
.field public static final a:Lf8/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lf8/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lf8/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf8/d;->a:Lf8/d;

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


# virtual methods
.method public bridge synthetic a(I)Lf8/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lf8/d;->c(I)Lf8/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic b(I)Lf8/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lf8/d;->d(I)Lf8/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(I)Lf8/d;
    .locals 0

    .line 1
    sget-object p1, Lf8/d;->a:Lf8/d;

    .line 2
    .line 3
    return-object p1
.end method

.method public d(I)Lf8/d;
    .locals 0

    .line 1
    sget-object p1, Lf8/d;->a:Lf8/d;

    .line 2
    .line 3
    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    sget-object v0, Li7/h0;->a:Li7/h0;

    .line 2
    .line 3
    return-object v0
.end method
