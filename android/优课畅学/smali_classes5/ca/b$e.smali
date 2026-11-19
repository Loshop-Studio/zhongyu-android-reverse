.class public final Lca/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lca/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lca/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final a:Lca/b$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lca/b$e;

    .line 2
    .line 3
    invoke-direct {v0}, Lca/b$e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lca/b$e;->a:Lca/b$e;

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
.method public a(Li9/e0;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p1}, Li9/e0;->close()V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 5
    .line 6
    return-object p1
.end method

.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Li9/e0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lca/b$e;->a(Li9/e0;)Lh7/p;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
