.class public final Lpd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpd/g;
.implements Lpd/c;


# static fields
.field public static final a:Lpd/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lpd/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lpd/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lpd/d;->a:Lpd/d;

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
.method public bridge synthetic a(I)Lpd/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lpd/d;->c(I)Lpd/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic b(I)Lpd/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lpd/d;->d(I)Lpd/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(I)Lpd/d;
    .locals 0

    .line 1
    sget-object p1, Lpd/d;->a:Lpd/d;

    .line 2
    .line 3
    return-object p1
.end method

.method public d(I)Lpd/d;
    .locals 0

    .line 1
    sget-object p1, Lpd/d;->a:Lpd/d;

    .line 2
    .line 3
    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    sget-object v0, Lrc/i0;->c:Lrc/i0;

    .line 2
    .line 3
    return-object v0
.end method
