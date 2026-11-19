.class public final Lc9/n$o;
.super Lc9/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc9/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "o"
.end annotation


# static fields
.field public static final a:Lc9/n$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc9/n$o;

    .line 2
    .line 3
    invoke-direct {v0}, Lc9/n$o;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc9/n$o;->a:Lc9/n$o;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc9/n;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lc9/v;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ll8/u$c;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lc9/n$o;->d(Lc9/v;Ll8/u$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Lc9/v;Ll8/u$c;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lc9/v;->e(Ll8/u$c;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method
