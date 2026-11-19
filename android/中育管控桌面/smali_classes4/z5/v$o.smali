.class public final Lz5/v$o;
.super Lz5/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz5/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "o"
.end annotation


# static fields
.field public static final a:Lz5/v$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lz5/v$o;

    .line 2
    .line 3
    invoke-direct {v0}, Lz5/v$o;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lz5/v$o;->a:Lz5/v$o;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lz5/v;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lz5/a0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lf5/z$c;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lz5/v$o;->d(Lz5/a0;Lf5/z$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Lz5/a0;Lf5/z$c;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lz5/a0;->e(Lf5/z$c;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method
